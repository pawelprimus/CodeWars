package primus.pawel;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    private static String README_NAME = "README.md";
    private static String CLASS_PATH = "src\\primus\\pawel\\";

    public static void main(String[] args) throws IOException {

        StatsMd statsMd = new StatsMd();
        ArrayList<Kata> allKatas = TextExtractor.getKatas(CLASS_PATH);
        statsMd.addExercisesAndSetStats(allKatas);
        FileCreator.generateFileMD(statsMd, README_NAME);
    }


}
