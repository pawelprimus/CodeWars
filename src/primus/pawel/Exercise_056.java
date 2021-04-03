package primus.pawel;

// reverse words
// 7kyu
// https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java
// 2021-04-03 T:19:37:06
class Exercise_056 {
    public static String reverseWords(final String original) {
        if (original.trim().length() > 0) {
            String[] orginalArr = original.split(" ");
            StringBuilder sbResult = new StringBuilder("");

            for (int i = 0; i < orginalArr.length; i++) {
                sbResult.append(new StringBuilder(orginalArr[i]).reverse()).append(" ");
            }
            return sbResult.toString().trim();
        }
        {
            return original;
        }
    }
}
