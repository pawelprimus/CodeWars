package primus.pawel;

// Binary Calculator
// 7kyu
// https://www.codewars.com/kata/546ba103f0cf8f7982000df4/train/java
// 2021-09-26 T:21:36:31
class Exercise_236 {

    public static String calculate(final String n1, final String n2, final String o) {

        int i = Integer.parseInt(n1, 2);
        int j = Integer.parseInt(n2, 2);
        int result = 0;
        switch (o){
            case "add":
                result = i+j;
                break;
            case "subtract":
                result = i-j;
                break;
            case "multiply":
                result = i*j;
                break;
            default:
            }
        return Integer.toBinaryString(result);
    }

}
