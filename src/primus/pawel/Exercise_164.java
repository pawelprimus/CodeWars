package primus.pawel;

// Write Number in Expanded Form
// 6kyu
// https://www.codewars.com/kata/5842df8ccbd22792a4000245/train/java
// 2021-06-28 T:20:53:24
public class Exercise_164 {

    public static String expandedForm(int num) {
        String number = String.valueOf(num);
        StringBuilder stringBuilderResult = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {

            if (number.charAt(i) != '0') {
                stringBuilderResult.append(number.charAt(i)).append("0".repeat(number.length() - i - 1));
                stringBuilderResult.append(" + ");
            }
        }

        stringBuilderResult.delete(stringBuilderResult.length()-3 , stringBuilderResult.length()-1);

            return stringBuilderResult.toString().trim();
    }


}
