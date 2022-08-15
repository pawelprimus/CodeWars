package src.primus.pawel;
// Bouncing Balls
// 6kyu
// https://www.codewars.com/kata/5544c7a5cb454edb3c000047/train/java
// 2022-08-15 T:22:35:38

public class Exercise_460 {

  public static int bouncingBall(double h, double bounce, double window) {

    if (bounce >= 1 || bounce <= 0 || window >= h) {
      return -1;
    }

    int seen = 1;
    double currentMaxHigh = h * bounce;

    while (currentMaxHigh > window) {
      seen += 2;
      currentMaxHigh *= bounce;
    }

    return seen;
  }

  public static void main(String[] args) {

    System.out.println(bouncingBall(3.0, 0.75, 3));
  }

}
