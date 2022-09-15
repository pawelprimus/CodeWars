package src.primus.pawel;

// What's your running pace?
// 7kyu
// https://www.codewars.com/kata/578b8c0e84ac69a4d20004c8/train/java
// 2022-09-15 T:18:48:30
public class Exercise_479 {

  public static String calculate(double distance, String time) {
    String[] times = time.split(":");

    double minutes = Double.parseDouble(times[0]);
    double seconds = Double.parseDouble(times[1]);
    double sumSeconds = minutes * 60 + seconds;
    double pace = Math.floor(sumSeconds / distance);
    String paceSeconds = String.valueOf((int) pace % 60);
    String paceMinutes = String.valueOf((int) (pace - pace % 60) / 60);
    paceSeconds = paceSeconds.length() == 1 ? "0" + paceSeconds : paceSeconds;

    return paceMinutes + ":" + paceSeconds;
  }

  public static void main(String[] args) {
  }


}
