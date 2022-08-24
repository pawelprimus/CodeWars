package src.primus.pawel;

import java.util.List;

// Describe a list
// 7kyu
// https://www.codewars.com/kata/57a4a3e653ba3346bc000810/train/java
// 2022-08-24 T:19:41:37
public class Exercise_470 {

  public static String describeList(final List list) {

    if(list.size() == 0){
      return "empty";
    }
    if(list.size() == 1){
      return "singleton";
    }
    return "longer";
  }


}
