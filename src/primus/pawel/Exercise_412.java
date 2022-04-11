package primus.pawel;

// Deodorant Evaporator
// 7kyu
// https://www.codewars.com/kata/5506b230a11c0aeab3000c1f/train/java
// 2022-04-10 T:10:33:32
class Exercise_412 {


    public static int evaporator(double content, double evap_per_day, double threshold) {
        double limit = content * (threshold / 100);
        double percentageEvapPerDay = evap_per_day / 100;
        int days = 0;
        while (content > limit) {
            content = content - content * percentageEvapPerDay;
            days++;
        }
        return days;
    }

    public static void main(String[] args) {
        System.out.println(evaporator(10, 10, 5));
    }

}
