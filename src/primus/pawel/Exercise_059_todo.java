package primus.pawel;

// Range extension
// 4kyu
// https://www.codewars.com/kata/51ba717bb08c1cd60f00002f/train/java
// 2021-04-07 T:23:33:46
class Exercise_059_todo {

    public static String rangeExtraction(int[] arr) {

        StringBuilder sbResult = new StringBuilder();
        int start = 0;
        int i = 0;
        for (; i < arr.length - 2; i++) {

            if (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 2) {
                sbResult.append(arr[i]).append("-");
                do {
                    i++;
                }
                while (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 2 && i < arr.length - 4);
                sbResult.append(arr[i+2]).append(",");
            } else {
                sbResult.append(arr[i]).append(",");
            }
        }

        if (i < arr.length) System.out.println("aa");

        return sbResult.deleteCharAt(sbResult.length() - 1).toString();
    }

    public static void main(String[] args) {
        System.out.println(rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20, 21, 26}));
    }

}
