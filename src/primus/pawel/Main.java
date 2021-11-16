package primus.pawel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
     /*   int bitmask = 32;
        int val = 1;
        char a = 'a';
        char A = 'A';
        // prints "2"
        System.out.println("Bitmask " + Integer.toBinaryString(bitmask));
        System.out.println( "val " +Integer.toBinaryString(val));
        System.out.println( "char a " +Integer.toBinaryString((a)));
        System.out.println(A << 64);*/

        //String file = "src\\primus\\pawel\\Exercise_001.java";
        String classPath = "src\\primus\\pawel\\";

        ArrayList<String> allFileNames = getAllFileNames(classPath);
        ArrayList<String> doneKata = getAllFileNames(classPath);

        ArrayList<Kata> allKatas = new ArrayList<>();

        for(String className : allFileNames){
            allKatas.add(readClass(className));
        }

        for(Kata kata : allKatas){
            System.out.println(kata.toFile());
        }




    }

    public static ArrayList<String> getAllFileNames(String path) {
        ArrayList<String> results = new ArrayList<String>();

        File[] files = new File(path).listFiles();
        for (File file : files) {
            if (file.isFile()) {
                if(file.toString().contains("Exercise")){
                    if(file.toString().contains("todo") || file.toString().contains("TODO")){

                    }
                    results.add(file.getName());
                }
            }
        }
        return results;
    }


    public static Kata readClass(String file) throws IOException {

        StringBuilder result = new StringBuilder();
        String classPath = "src\\primus\\pawel\\";
        Kata kata = new Kata();
        System.out.println(file);
        int slashCounter = 0;
        ArrayList<String> kataArr = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(classPath + "\\" + file));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();

                if(line != null){
                    if(slashCounter<4){

                        if(line.contains("//")){
                            kataArr.add(line.replace("//", "").trim());
                            slashCounter++;
                            System.out.println(line);
                        }

                    }
                }
            }
            String everything = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }

        kata.setNumber(file.replaceAll("[^0-9]",""));
        kata.setName(kataArr.get(0));
        kata.setKyu(kataArr.get(1));
        kata.setLink(kataArr.get(2));
        kata.setDate(kataArr.get(3));

        if(file.contains("todo") || file.contains("TODO")){
            kata.setStatus(Kata.Status.TODO);
        } else {
            kata.setStatus(Kata.Status.DONE);
        }

        return kata;
    }
}
