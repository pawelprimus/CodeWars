package primus.pawel;

// Ordering the words!
// 7kyu
// https://www.codewars.com/kata/55d7e5aa7b619a86ed000070/train/java
// 2021-12-01 T:21:34:34
class Exercise_302 {

    public static String orderWord(String s){

        if(s == null || s.length() == 0){
            return "Invalid String!";
        }

        return s.chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static void main(String[] args) {
        orderWord("!Hi You!");
    }


}
/*if(s==null||"".equals(s))return "Invalid String!";
    char [] a = s.toCharArray();
    java.util.Arrays.sort(a);
    return String.valueOf(a)

     return (s == null || s.length() == 0) ? "Invalid String!" : s.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
    */