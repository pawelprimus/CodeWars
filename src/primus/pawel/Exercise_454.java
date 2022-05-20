package primus.pawel;

// Selective fear of numbers
// 7kyu
// https://www.codewars.com/kata/55b1fd84a24ad00b32000075/train/java
// 2022-05-20 T:18:54:57
class Exercise_454 {

    static public boolean AmIAfraid(final String day, final int num) {

        switch (day) {
            case "Monday":
                return num == 12;
            case "Tuesday":
                return num > 95;
            case "Wednesday":
                return num == 34;
            case "Thursday":
                return num == 0;
            case "Friday":
                return num % 2 == 0;
            case "Saturday":
                return num == 56;
            case "Sunday":
                return (num == 666 || num == -666);
            default:
                return false;
        }
    }
}
