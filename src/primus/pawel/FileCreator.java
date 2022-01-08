package primus.pawel;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

class FileCreator {

    static void generateFileMD(StatsMd statsMd, String fileName){
        try (PrintWriter out = new PrintWriter(fileName)) {
            out.println(statsMd.getHeader());
            out.println(statsMd.getStats());
            out.println(statsMd.getExercises());
            System.out.println("FILE IS SAVED");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
