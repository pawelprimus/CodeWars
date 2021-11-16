package primus.pawel;

import java.util.HashSet;
import java.util.Set;

// Next bigger number with the same digits
// 4kyu
//https://www.codewars.com/kata/55983863da40caa2c900004e/train/java
// 2021-04-29 T:21:44:25
// out of time :(
class Exercise_003 {


    public static long nextBiggerNumber(long n) {

        long result = Long.MAX_VALUE;
        Set<String> permutations = getPermutation(String.valueOf(n));

        long currentLong =0;
        for (String number : permutations){
            currentLong = Long.parseLong(number);
            if(currentLong > n && currentLong < result){
                result = currentLong;
            }
        }

        return (result == Long.MAX_VALUE) ? -1 : result;
    }


    public static Set<String> getPermutation(String str) {

        // create a set to avoid duplicate permutation
        Set<String> permutations = new HashSet<String>();

        // check if string is null
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            // terminating condition for recursion
            permutations.add("");
            return permutations;
        }

        // get the first character
        char first = str.charAt(0);

        // get the remaining substring
        String sub = str.substring(1);

        // make recursive call to getPermutation()
        Set<String> words = getPermutation(sub);

        // access each element from words
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){

                // insert the permutation to the set
                permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
            }
        }
        return permutations;
    }






    public static void main(String[] args) {

        nextBiggerNumber(19009);

    }
}

/*  public static long nextBiggerNumber(long n)
    {
      char [] s = String.valueOf(n).toCharArray();
      for(int i = s.length - 2; i >= 0; i--){
         for (int j = s.length-1; j > i; j--){
           if(s[i] < s[j]){
             char tmp = s[i];
             s[i] = s[j];
             s[j] = tmp;
             Arrays.sort(s, i+1, s.length);
             return Long.valueOf(String.valueOf(s));
           }
         }
      }
      return -1;
    }
    */