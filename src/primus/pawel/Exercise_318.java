package primus.pawel;
// Odd-Even String Sort
// 7kyu
// https://www.codewars.com/kata/580755730b5a77650500010c/train/java
// 2021-12-27 T:22:30:00
class Exercise_318 {

    public static String sortMyString(String s) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if(i%2 == 0 ){
                even.append(s.charAt(i));
            } else {
                odd.append(s.charAt(i));
            }
        }
        return even.append(" ").append(odd).toString();
    }

}
