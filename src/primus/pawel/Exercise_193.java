package primus.pawel;

// Find Screen Size
// 7kyu
// https://www.codewars.com/kata/5bbd279c8f8bbd5ee500000f/train/java
// 2021-08-02 T:23:00:01
class Exercise_193 {

    public static String findScreenHeight(int width, String ratio) {
        String[] arr = ratio.split(":");

        double height = Double.parseDouble(arr[1]) / Double.parseDouble(arr[0]) * width;
        return width + "x" + (int)height;
    }


    public static void main(String[] args) {
        System.out.println(findScreenHeight(3840, "32:9"));
    }
}
