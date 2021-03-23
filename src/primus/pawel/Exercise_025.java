package primus.pawel;

// 7kyu
// https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/java
// 2021-03-20 T:10:52:29

class Exercise_025 {

    public static int findShort(String s) {

        int result = Integer.MAX_VALUE;
        String[] words = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            //System.out.println(words[i]);
            if (words[i].length() < result) {
                result = words[i].length();
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(findShort("This is a sample sentence"));
    }


}

/*public static int findShort(String s) {
        return Stream.of(s.split(" "))
          .mapToInt(String::length)
          .min()
          .getAsInt();
    }

    public static int findShort(String s) {
        int min = Integer.MAX_VALUE;
        for(String each : s.split(" "))
        {
        if(each.length() < min)
        min = each.length();
        }
         return min;
    }



    */



