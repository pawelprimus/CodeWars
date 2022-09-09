package src.primus.pawel;

import java.util.Arrays;
import java.util.HashMap;

// Paul's Misery
// 7kyu
// https://www.codewars.com/kata/57ee31c5e77282c24d000024/train/java
// 2022-09-09 T:16:47:03
public class Exercise_480 {

  private static final HashMap<String, Integer> pointMap = new HashMap<>(){{
    put("life", 0);
    put("eating", 1);
    put("kata", 5);
    put("Petes kata", 10);
  }};

  public static String paul(String[] x) {

    Arrays.stream(x).forEach(System.out::println);
    System.out.println("---------");
    int score = Arrays.stream(x).map(pointMap::get).reduce(0 ,Integer::sum);

    System.out.println(score);
    if(score<40){
      return "Super happy!";
    }
    if(score<70){
      return "Happy!";
    }
    if(score <100){
      return "Sad!";
    }
    return "Miserable!";
  }

  public static void main(String[] args) {
    System.out.println( paul(new String[]{"Petes kata", "Petes kata", "kata", "Petes kata", "kata", "life" , "Petes kata" , "Petes kata" , "Petes kata"}));
  }

}



