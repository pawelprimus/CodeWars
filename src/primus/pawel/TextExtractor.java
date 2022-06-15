package primus.pawel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

class TextExtractor {


    static ArrayList<Kata> getKatas(String classPath) throws IOException {
        ArrayList<String> allFileNames = getAllFileNames(classPath);
        ArrayList<Kata> allKatas = new ArrayList<>();

        for (String className : allFileNames) {
            allKatas.add(readClass(className, classPath));
        }

        return allKatas;
    }

    private static ArrayList<String> getAllFileNames(String path) throws IOException {
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
            //StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                //sb.append(line);
                //sb.append(System.lineSeparator());

                    if (line.contains("//")) {
                        if (slashCounter < 4) {
                            kataArr.add(line.replace("//", "").trim());
                            slashCounter++;
                            System.out.println(line);
                        }
                    }
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }

        if (kataArr.size() != 0) {
            kataArr.forEach(System.out::println);

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
        } else {
            kata = null;
        }

        return kata;
    }

}
