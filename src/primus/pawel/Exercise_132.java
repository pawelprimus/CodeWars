package primus.pawel;
// Parts of list
// 7kyu
// https://www.codewars.com/kata/56f3a1e899b386da78000732/train/java
// 2021-05-18 T:20:04:37
class Exercise_132 {
    public static String[][] partlist(String[] arr) {
        String[][] resultsList = new String[arr.length-1][2];
        int dotIndex = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < resultsList.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                sb.append(arr[j]).append(" ");
                if(j==i){
                    resultsList[i][dotIndex] = sb.toString().trim();
                    dotIndex++;
                    sb.delete(0, sb.length());
                }
            }
            resultsList[i][dotIndex] = sb.toString().trim();
            sb.delete(0, sb.length());
            dotIndex = 0;
        }
        return resultsList;
    }

    public static void main(String[] args) {
    String[] a = new String[]{"az", "toto", "picaro", "zone", "kiwi"};
        partlist(a);
    }
}
