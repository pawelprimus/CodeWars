package primus.pawel;
// How many times does it contain?
// 7kyu
// https://www.codewars.com/kata/584466950d3bedb9b300001f/train/java
// 2021-09-12 T:12:16:05
class Exercise_220 {

    public static int stringCounter(String inputS, char charS){
        int count = 0;
        for (int i = 0; i < inputS.length(); i++) {
            if(inputS.charAt(i) == charS){
                count++;
            }
        }

        return count;
    }


}

/*  public static int stringCounter(String inputS, char charS){
    return (int)inputS.chars().filter(c -> c == charS).count();
  }*/
