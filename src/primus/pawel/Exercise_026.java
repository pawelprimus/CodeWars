package primus.pawel;
// Isograms
// 7kyu
// https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java
// 2021-03-20 T:11:27:19


class Exercise_026 {

    public static boolean isIsogram(String str) {

        String newStr = str.toLowerCase();
        int[] charCountArr = new int[126];
        for (int i = 0; i < newStr.length(); i++) {
            charCountArr[newStr.charAt(i)]++;
            if (charCountArr[newStr.charAt(i)] > 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isIsogram("aba"));
    }
}

/*public static boolean isIsogram(String str) {
        return str.toLowerCase()
                  .chars()
                  .distinct()
                  .count() == str.length();
    }*/
