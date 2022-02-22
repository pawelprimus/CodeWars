package primus.pawel;
// "Very Even" Numbers.
// 7kyu
// https://www.codewars.com/kata/58c9322bedb4235468000019/train/java
// 2022-02-22 T:23:59:06
class  Exercise_380 {

    public static boolean isVeryEvenNumber(int number) {
        while (number > 9){
            number = (String.valueOf(number).codePoints().map(Character::getNumericValue).reduce(0 , Integer::sum));
            System.out.println(number);
        }
            return number%2 == 0;
    }

    public static void main(String[] args) {
        isVeryEvenNumber(1234);
    }
}
