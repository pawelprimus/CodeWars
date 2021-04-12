package primus.pawel;

// Beginner Series #2 Clock
// 8kyu
// https://www.codewars.com/kata/55f9bca8ecaa9eac7100004a/train/java
// 2021-04-12 T:20:32:44
class Exercise_071 {

    public static int Past(int h, int m, int s) {
        return h*3600000 + m*60000 + s*1000 ;
    }
}

/*public static int Past(int h, int m, int s) {
    return (int)Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis();
  }

  */
