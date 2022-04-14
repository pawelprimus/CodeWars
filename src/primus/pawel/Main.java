package primus.pawel;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    private static String README_NAME = "README.md";
    private static String CLASS_PATH_JAVA = "src\\primus\\pawel\\";
    private static String CLASS_PATH_JS = "src\\JS\\";
    private static String JAVA = "()";
    private static String JAVA_SCRIPT = "(https://raw.githubusercontent.com/devicons/devicon/1119b9f84c0290e0f0b38982099a2bd027a48bf1/icons/javascript/javascript-original.svg)";



    public static void main(String[] args) throws IOException {

        StatsMd statsMd = new StatsMd();
        ArrayList<Kata> JavaKatas = TextExtractor.getKatas(CLASS_PATH_JAVA);
        ArrayList<Kata> JSKatas = TextExtractor.getKatas(CLASS_PATH_JS);
        statsMd.addExercisesAndSetStats(JavaKatas, JAVA);
        statsMd.addExercisesAndSetStats(JSKatas, JAVA_SCRIPT);
        FileCreator.generateFileMD(statsMd, README_NAME);
    }


}
