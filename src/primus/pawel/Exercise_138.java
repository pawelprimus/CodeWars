package primus.pawel;

import java.util.LinkedList;

// Who likes it
// 6kyu
// https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java
// 2021-05-27 T:23:26:14
class Exercise_138 {
    public static String whoLikesIt(String... names) {
        LinkedList<String> namesList = new LinkedList<>();
        for (String name : names) {
            namesList.add(name);
        }
        if (namesList.size() == 0) {
            return "no one likes this";
        }
        if (namesList.size() == 1) {
            return namesList.get(0) + " likes this";
        }
        if (namesList.size() == 2) {
            return namesList.get(0) + " and " + namesList.get(1) + " like this";
        }
        if (namesList.size() == 3) {
            return namesList.get(0) + ", " + namesList.get(1) + " and " + namesList.get(2) + " like this";
        }

        return namesList.get(0) + ", " + namesList.get(1) + " and " + (namesList.size() - 2) + " others like this";
    }
}

/*class Solution {
    public static String whoLikesIt(String... names) {
        switch (names.length) {
          case 0: return "no one likes this";
          case 1: return String.format("%s likes this", names[0]);
          case 2: return String.format("%s and %s like this", names[0], names[1]);
          case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
          default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }
}

class Solution {
  public static String whoLikesIt(String... names) {
    final String Template1 = "%s likes this";
    final String Template2 = "%s and %s like this";
    final String Template3 = "%s, %s and %s like this";
    final String TemplateN = "%s, %s and %d others like this";
    return
        names.length == 0 ? "no one likes this" :
        names.length == 1 ? String.format(Template1, names[0]) :
        names.length == 2 ? String.format(Template2, names[0], names[1]) :
        names.length == 3 ? String.format(Template3, names[0], names[1], names[2]) :
        String.format(TemplateN, names[0], names[1], names.length-2);
  }
}


*/
