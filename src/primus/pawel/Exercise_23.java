package primus.pawel;
//kyu 7
//https://www.codewars.com/kata/56747fd5cb988479af000028/train/java
//2021-03-19 T:21:29:52

class Exercise_23 {

    public static String getMiddle(String word) {
        String result = "";
        if(word.length()%2 == 0){
            result += word.charAt(word.length()/2 - 1);
            result += word.charAt(word.length()/2);
        } else {
            result += word.charAt(word.length()/2);
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(getMiddle("middle"));
    }

}

/*  public static String getMiddle(String word) {
    String s = "";
    int length = word.length();
    int half = length/2;

    if (length % 2 == 0) {

      s = word.substring(half - 1, half + 1);

    } else {

      s = word.substring(half, half + 1);

    }

    return s;
  }*/

/*public static String getMiddle(String word) {
        int length = word.length();
        return (length % 2 != 0) ?  String.valueOf(word.charAt(length / 2)) : word.substring(length / 2 - 1, length / 2 + 1);
    }*/