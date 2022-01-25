package primus.pawel;

// Triangle number check
// 6kyu
// https://www.codewars.com/kata/557e8a141ca1f4caa70000a6/train/java
// 2022-01-25 T:21:26:21
class Exercise_351 {

    public static Boolean isTriangleNumber(long number) {

        if (number < 1) {
            return true;
        }
        int loop = 0;
        int i = 1;
        while (loop < number) {
            loop += i;
            i++;
            if(loop==number){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isTriangleNumber(125250));
        //sumTriangularNumbers(5);
    }
}
