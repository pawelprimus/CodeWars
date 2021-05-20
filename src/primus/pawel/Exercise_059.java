package primus.pawel;

import java.util.LinkedList;

// Range extension
// 4kyu
// https://www.codewars.com/kata/51ba717bb08c1cd60f00002f/train/java
// 2021-04-07 T:23:33:46 2021-04-29 T:21:41:21
class Exercise_059 {

    public static String rangeExtraction(int[] arr) {
        StringBuilder sbResult = new StringBuilder();
        LinkedList<Integer> que = new LinkedList<>();
        que.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - 1 != arr[i - 1]) {
                sbResult.append(wrapQue(que));
                que.clear();
                que.add(arr[i]);
                if (i == arr.length - 1) {
                    sbResult.append(wrapQue(que));
                }
            } else {
                que.add(arr[i]);
                if (i == arr.length - 1){
                    sbResult.append(wrapQue(que));
                }
            }
        }
        return sbResult.deleteCharAt(sbResult.length() - 1).toString();
    }


    public static String wrapQue(LinkedList<Integer> arr) {
        StringBuilder sb = new StringBuilder();
        if (arr.size() == 1) return sb.append(arr.get(0)).append(",").toString();
        if (arr.size() == 2) return sb.append(arr.get(0)).append(",").append(arr.get(1)).append(",").toString();
        return sb.append(arr.get(0)).append("-").append(arr.get(arr.size() - 1)).append(",").toString();
    }

    public static void main(String[] args) {
        //System.out.println(rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20, 21, 26}));
        System.out.println(rangeExtraction(new int[]{-3, -2, -1, 2, 10, 15, 16, 18, 19, 20}));
        LinkedList<Integer> ls = new LinkedList<>();
        ls.add(1);
        ls.add(2);
        //ls.add(3);

    }

}

/* StringBuilder sbResult = new StringBuilder();
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

        if (i < arr.length) System.out.println("aa");*/