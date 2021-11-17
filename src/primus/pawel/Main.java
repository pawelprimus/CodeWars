package primus.pawel;

import java.io.*;
import java.util.ArrayList;

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
        ArrayList<Kata> allKatas = new ArrayList<>();
        int done = 0;
        int todo = 0;

        int[] kyulevels = new int[8];

        for (String className : allFileNames) {
            allKatas.add(readClass(className));
        }

        StringBuilder header = new StringBuilder();
        StringBuilder stats = new StringBuilder();
        StringBuilder exercises = new StringBuilder();

        header.append("![](https://www.codewars.com/users/%3Cprim%3Erim%3C%2Fprim%3E/badges/large)").append("<br />");

        for (Kata kata : allKatas) {
            System.out.println(kata.toFile());
            exercises.append(kata.toFile()).append("<br />");
            if (kata.getStatus().equals(Kata.Status.DONE)) {
                done++;
                kyulevels[kata.getKyuNumber() - 1]++;
            } else {
                todo++;
            }
        }

        stats.append("DONE: " + done).append("<br />");

        stats.append(getKyuStats(kyulevels));

        stats.append("TODO: " + todo).append("<br />");
        System.out.println("DONE: " + done);
        System.out.println("TODO: " + todo);


        System.out.println(allKatas.size());
        System.out.println(allFileNames.size());

        try (PrintWriter out = new PrintWriter("README.md")) {
            out.println(header);
            out.println(stats);
            out.println(exercises);
        }


    }

    public static String getKyuStats(int[] kyulevels){
        StringBuilder kyuStats = new StringBuilder();
        for (int i = 0; i < kyulevels.length; i++) {
            if(kyulevels[i]>0){
                kyuStats.append(i+1).append("KYU: ").append(kyulevels[i]).append("<br />");
            }
        }

        System.out.println(kyuStats.toString());
        return kyuStats.toString();
    }

    public static ArrayList<String> getAllFileNames(String path) {
        ArrayList<String> results = new ArrayList<String>();

        File[] files = new File(path).listFiles();
        for (File file : files) {
            if (file.isFile()) {
                if (file.toString().contains("Exercise")) {
                    if (file.toString().contains("todo") || file.toString().contains("TODO")) {

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

                if (line != null) {
                    if (slashCounter < 4) {

                        if (line.contains("//")) {
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

        kata.setNumber(file.replaceAll("[^0-9]", ""));
        kata.setName(kataArr.get(0));
        kata.setKyu(kataArr.get(1));
        kata.setLink(kataArr.get(2));
        kata.setDate(kataArr.get(3));

        if (file.contains("todo") || file.contains("TODO")) {
            kata.setStatus(Kata.Status.TODO);
        } else {
            kata.setStatus(Kata.Status.DONE);
        }

        return kata;
    }
}
