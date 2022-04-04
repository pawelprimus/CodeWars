package primus.pawel;
// How many pages in a book?
// 6kyu
// https://www.codewars.com/kata/622de76d28bf330057cd6af8/train/java
// 2022-04-05 T:00:36:40
class Exercise_410 {

    public static int amountOfPages(int summary) {
        int digits = 1;
        int numbers = 0;
        while (numbers < summary){
            numbers += String.valueOf(digits).length();
            digits++;
        }
        return digits - 1;
    }


}
