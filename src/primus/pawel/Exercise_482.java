package src.primus.pawel;

import java.util.Collections;

// Decimal decomposition
// 7kyu
// https://www.codewars.com/kata/581f5cf739dc42ac2400007b/train/java
// 2022-09-11 T:12:09:36
public class Exercise_482 {

  public static String decimalDecomposition(int number){
    String strNumber = String.valueOf(number);
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < strNumber.length(); i++) {
      if(strNumber.charAt(i) != '0'){
        result.append(strNumber.charAt(i)).append(String.join("", Collections.nCopies(strNumber.length() - 1 - i, "0"))).append("+");
      }
    }
    return result.deleteCharAt(result.length()-1).toString();
  }

  public static void main(String[] args) {
    System.out.println(decimalDecomposition(712654));
  }
}
