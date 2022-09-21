package src.primus.pawel;

// Calculate mean and concatenate string
// 7kyu
// https://www.codewars.com/kata/56f7493f5d7c12d1690000b6/train/java
// 2022-09-21 T:21:19:57
public class Exercise_484 {

  public static Object[] mean(char[] lst) {
    String resultString = "";
    int sum = 0;
    for (char charArr : lst) {
      try {
        sum += Integer.parseInt(String.valueOf(charArr));
      } catch (NumberFormatException e) {
        resultString += charArr;
      }
    }

    return new Object[]{sum / 10.0, resultString};
  }


  public static void main(String[] args) {

    System.out.println(mean(new char[]{'u', '6', 'd', '1', 'i', 'w', '6', 's', 't', '4', 'a', '6', 'g', '1', '2', 'w', '8', 'o', '2', '0'}));
  }
}
