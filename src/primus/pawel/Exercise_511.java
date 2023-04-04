package src.primus.pawel;
// Chinese Zodiac
// 7kyu
// https://www.codewars.com/kata/57a73e697cb1f31dd70000d2/train/java
// 2023-04-04 T:22:45:02
public class Exercise_511 {

    private static final String[] ANIMALS = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};
    private static final String[] ELEMENTS = {"Wood", "Fire", "Earth", "Metal", "Water"};
    private static final int EPOCH = 1924;

    public static String chineseZodiac(int year) {
        int yearOrder = year - EPOCH;
        int animalIndex = yearOrder %12;
        int elementIndex = yearOrder %10 /2;
        return ELEMENTS[elementIndex] + " " + ANIMALS[animalIndex];
    }

    public static void main(String[] args) {
        System.out.println(chineseZodiac(1924));
        System.out.println(chineseZodiac(1925));
        System.out.println(chineseZodiac(1926));
        System.out.println(chineseZodiac(1927));
        System.out.println(chineseZodiac(2016));
        System.out.println(chineseZodiac(1925));
    }

}
