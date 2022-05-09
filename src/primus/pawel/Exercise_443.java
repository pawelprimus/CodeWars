package primus.pawel;

// Battle of the characters (Easy)
// 7kyu
// https://www.codewars.com/kata/595519279be6c575b5000016/train/java
// 2022-05-09 T:19:08:48
class Exercise_443 {

    public static String battle(final String x, final String y) {
        int xPower = countPower(x);
        int yPower = countPower(y);

        if(xPower == yPower){
            return "Tie!";
        }
        return xPower > yPower ? x : y;
    }

    private static int countPower(final String charArmy) {
        return charArmy.chars().mapToObj(i -> i - 64).reduce(Integer::sum).orElse(0);
    }

    public static void main(String[] args) {
        battle("VFAWXWUTJ", "WICN");
    }

}
