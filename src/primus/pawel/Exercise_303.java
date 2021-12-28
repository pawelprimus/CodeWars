package primus.pawel;
// MOD 256 without the MOD operator
// 7kyu
// https://www.codewars.com/kata/581e1d083a4820eb4f00004f/train/java
// 2021-12-28 T:18:12:17
class Exercise_303 {

    private static int MOD = 256;

    public static int mod256WithoutMod(int number)
    {
        int divided = number/MOD;
        if(divided * MOD == number){
            return 0;
        } else {
            return number - divided*MOD;
        }
    }

    public static void main(String[] args) {

        System.out.println(mod256WithoutMod(-256));
    }
}
