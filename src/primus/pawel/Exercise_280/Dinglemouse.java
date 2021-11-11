package primus.pawel.Exercise_280;

import java.util.LinkedHashSet;

public class Dinglemouse {

    LinkedHashSet<String> map = new LinkedHashSet<>();

    int counter = 0;

    String name;
    int age;
    char sex;

    public Dinglemouse() {
    }

    public Dinglemouse setAge(int age) {
        counter++;
        map.add(" I am [AGE].");

        this.age = age;
        return this;
    }

    public Dinglemouse setSex(char sex) {
        counter++;
        map.add(" I am [SEX].");

        this.sex = sex;
        return this;
    }

    public Dinglemouse setName(String name) {
        counter++;
        map.add(" My name is [NAME].");

        this.name = name;
        return this;
    }

        public String hello() {

            String sb = "Hello.";
            for (String word : map) {
                sb += (word);
            }
            if (map.contains(" My name is [NAME].")) {
                sb = sb.replace("[NAME]", this.name);
            }
            if (map.contains(" I am [AGE].")) {
                sb = sb.replace("[AGE]", String.valueOf(this.age));
            }
            if (map.contains(" I am [SEX].")) {
                sb = sb.replace("[SEX]", sex == 'M' ? "male" : "female");
            }
            return sb;
        }

}