package primus.pawel;

// Find the unique number
// 6kyu
// https://www.codewars.com/kata/585d7d5adb20cf33cb000235/
// 2021-03-30 T:23:05:12
class Exercise_046 {

    public static double findUniq(double arr[]) {

        if (arr[0] != arr[1]) {
            if (arr[2] == arr[0]) {
                return arr[1];
            } else {
                return arr[0];
            }
        } else {
            for (double v : arr) {
                if (v != arr[0]) return v;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        double arr[] = {1, 1, 1, 2, 1, 1};
        System.out.println(findUniq(arr));

    }
}
