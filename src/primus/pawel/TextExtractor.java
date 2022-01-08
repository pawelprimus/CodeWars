package primus.pawel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class TextExtractor {


    static ArrayList<Kata> getKatas(String classPath) throws IOException {
        ArrayList<String> allFileNames = getAllFileNames(classPath);
        ArrayList<Kata> allKatas = new ArrayList<>();

        for (String className : allFileNames) {
            allKatas.add(readClass(className, classPath));
        }

        return allKatas;

    }

    private static ArrayList<String> getAllFileNames(String path) {
        ArrayList<String> results = new ArrayList<String>();

        File[] files = new File(path).listFiles();
        for (File file : files) {
            if (file.isFile()) {
                if (file.toString().contains("Exercise")) {
                    results.add(file.getName());
                }
            }
        }
        return results;
    }


    private static Kata readClass(String file, String classPath) throws IOException {

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
