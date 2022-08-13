package primus.pawel;

// Regexp Basics - is it a letter?
// 7kyu
// https://www.codewars.com/kata/567de72e8b3621b3c300000b/train/java
// 2021-07-14 T:21:23:04
class Exercise_179 {

    public static boolean isLetter(String s) {
        return s.matches("[a-zA-Z]");
    }

}

/*\p{L} matches anything that is a Unicode letter if you're interested in alphabets beyond the Latin one*/