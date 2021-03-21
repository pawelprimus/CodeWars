package primus.pawel;

//https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java

import java.util.ArrayList;

class Exercise_14 {

    public static int sortDesc(final int num) {
        //Your code

        if(num==0){
            return 0;
        }

        int number = num;
        StringBuilder result = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();
        while (number > 0) {
            arr.add(number % 10);
            number = number / 10;
            //   System.out.println(number);
        }
        //arr.forEach((n) -> System.out.println(n));
        arr.sort(Integer::compareTo);

        for (int i = arr.size() - 1; i > -1; i--) {
           // System.out.println("Arr = " + arr.get(i));
            result.append(arr.get(i));
        }
        //System.out.println(result);
        //number = Integer.parseInt(result.toString());
        //String resultString = result.toString();
       // int number2 = Integer.parseInt(resultString);

        return Integer.parseInt(result.toString());
        //arr.forEach((n) -> System.out.println(n));
    }

    public static void main(String[] args) {

        sortDesc(0);

    }
}


/* String[] numbers = (Integer.toString(Integer.valueOf(num))).split("");
    Arrays.sort(numbers);

    String result = "";

    for(String s : numbers)
    {
      result = s + result;
    }*/