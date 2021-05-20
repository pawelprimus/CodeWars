package primus.pawel;

// Two to One
// 7kyu
// https://www.codewars.com/kata/5656b6906de340bd1b0000ac/train/java
// 2021-03-31 T:18:25:24
class Exercise_048 {

    public static String longest(String s1, String s2) {
        boolean[] occuerences = new boolean[26];

        for (int i = 0; i < s1.length(); i++) {
            occuerences[(int) s1.charAt(i) - 97] = true;
        }
        for (int i = 0; i < s2.length(); i++) {
            occuerences[(int) s2.charAt(i) - 97] = true;
        }

        StringBuilder sbResult = new StringBuilder();
        for (int i = 0; i < occuerences.length; i++) {
            if (occuerences[i]) {
                sbResult.append((char) (i + 97));
            }
        }
        return sbResult.toString();
    }

    public static void main(String[] args) {

        System.out.println(longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
    }
}

/*  public static String longest (String s1, String s2) {
        return Stream.of(s1.concat(s2).split(""))
                  .sorted()
                  .distinct()
                  .collect(Collectors.joining());

                   public static String longest (String s1, String s2) {
        return (s1 + s2).chars().distinct().mapToObj(c -> String.valueOf((char)c)).sorted().collect(Collectors.joining());
    }
    }*/