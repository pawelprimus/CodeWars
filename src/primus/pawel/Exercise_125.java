package primus.pawel;

// All Star Code Challenge #22
// 7kyu
// https://www.codewars.com/kata/5865cff66b5699883f0001aa/train/java
// 2021-05-14 T:19:13:20
class Exercise_125 {
    public static String toTime(int seconds) {
        return seconds / 3600 + " hour(s) and " + (seconds % 3600) / 60 + " minute(s)";
    }

}
/*public static String toTime(int s) {
    return String.format("%d hour(s) and %d minute(s)", s / 3600, s % 3600 / 60);
  }

  public static String toTime(final int seconds) {
        final Duration duration = Duration.ofSeconds(seconds);
        return String.format("%d hour(s) and %d minute(s)", duration.toHours(), duration.toMinutesPart());
    }
  */
