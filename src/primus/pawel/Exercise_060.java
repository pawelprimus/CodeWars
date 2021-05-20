package primus.pawel;

// Strings end with
// 7kyu
// https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/java
// 2021-04-08 T:00:34:13
class Exercise_060 {

    public static boolean solution(String str, String ending) {
        if (str == "" || ending.length() > str.length()) {
            return false;
        }
        for (int i = 0; i < ending.length(); i++) {
            if (str.charAt(str.length() - ending.length() + i) != ending.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution("samurai", "ai"));
    }
}

/*public static boolean solution(String str, String ending) {
    return str.endsWith(ending);


      public static boolean solution(String str, String ending) {
    if(str.length() < ending.length()) {
      return false;
    }
    else {
      return str.substring(str.length() - ending.length()).equals(ending);
    }
  }
  }*/
