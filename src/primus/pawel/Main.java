package primus.pawel;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    private static String README_NAME = "README.md";
    private static String CLASS_PATH_JAVA = "src\\primus\\pawel\\";
    private static String CLASS_PATH_JS = "src\\JS\\";

    public static void main(String[] args) throws IOException {

        StatsMd statsMd = new StatsMd();
        ArrayList<Kata> JavaKatas = TextExtractor.getKatas(CLASS_PATH_JAVA);
        ArrayList<Kata> JSKatas = TextExtractor.getKatas(CLASS_PATH_JS);
        statsMd.addExercisesAndSetStats(JavaKatas);
        statsMd.addExercisesAndSetStats(JSKatas);
        FileCreator.generateFileMD(statsMd, README_NAME);
    }


}
