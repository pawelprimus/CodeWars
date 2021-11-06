package primus.pawel;
// Triangle area
// 7kyu
// https://www.codewars.com/kata/59bd84b8a0640e7c49002398/train/java
// 2021-11-06 T:11:38:37
class Exercise_272 {

    public static float tArea(String tStr) {
        String[] lines = tStr.split("\r\n|\r|\n");
        float triangleLength = lines.length - 2;
        return triangleLength*triangleLength/2;
    }

    public static void main(String[] args) {
        String triangle = "\n.\n. .\n. . .\n. . . .\n. . . . .\n. . . . . .\n. . . . . . .\n. . . . . . . .\n. . . . . . . . .\n";
        String[] lines = triangle.split("\r\n|\r|\n");
        System.out.println(lines.length);

    }
}
