package primus.pawel;

// Reversing Fun
// 7kyu
// https://www.codewars.com/kata/566efcfbf521a3cfd2000056/train/java
//2021-09-22 T:00:02:43
class Exercise_231 {

    public static String funReverse(String s) {
        StringBuilder builder = new StringBuilder(new StringBuilder(s).reverse());
        for (int i = 1; i < builder.length(); i++) {
                builder = new StringBuilder(builder.substring(0,i) + new StringBuilder(builder.substring(i , builder.length() )).reverse());
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(funReverse("012345"));
    }


}
