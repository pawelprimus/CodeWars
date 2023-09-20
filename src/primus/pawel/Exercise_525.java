package src.primus.pawel;
// Ghostbusters (whitespace removal)
// 7kyu
// https://www.codewars.com/kata/5668e3800636a6cd6a000018/train/java
// 2023-09-20 T:22:16:24
public class Exercise_525 {

    public static String ghostBusters(String building) {
        String buildingWithoutGhosts = building.replaceAll( " ", "");

        return building.length() == buildingWithoutGhosts.length() ? "You just wanted my autograph didn't you?" : buildingWithoutGhosts;
    }
}
