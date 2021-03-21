package primus.pawel;

import java.util.ArrayList;

class Exercise_4 {

    public static String listSquared(long m, long n) {
        // your code

        int sum = 0;
        int resIndex = 0;
       // ArrayList<ArrayList<String>> result = new ArrayList<>();
            String result= "[";

        for (long i = m; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum = sum + (j * j);
                    //System.out.println("Divisor of " + i + " is " + j);
                }
            }
            //System.out.println("Sum of squares divisor of " + i + " is " + sum );

            if (checkPerfectSquare(sum)) {
                //result.add(new ArrayList<String>());

                String a = String.valueOf(i);
                String b = String.valueOf(sum);
                if(resIndex==0){
                    result+= "[" + a + ", " + b  + "]";
                } else
                {
                    result+= ", [" + a + ", " + b  + "]";
                }
               // result.get(resIndex).add(a);
               // result.get(resIndex).add(b);*/

                resIndex++;
            }

            sum = 0;
        }

        result += "]";


        return result;
    }

    static boolean checkPerfectSquare(long number) {
//calculating the square root of the given number
        double sqrt = Math.sqrt(number);
//finds the floor value of the square root and comparing it with zero
        return ((sqrt - Math.floor(sqrt)) == 0);
    }

    public static void main(String[] args) {

        System.out.println(listSquared(1, 42));

       // System.out.println(checkPerfectSquare(25));

    }


}


/* public static String listSquared(long m, long n) {
        List<List<Integer>> finalRes = new ArrayList<List<Integer>>();
        for (long i = m;i<=n;i++){
            double result = 0;
            for (int y=1;y<=i;y++){
               if (i%y==0){
                   result = result + Math.pow(y,2);
               }
            }
            if (Math.sqrt(result)%1==0){
                List<Integer> pair = new ArrayList<Integer>();
                pair.add((int) i);
                pair.add((int) result);
                finalRes.add(pair);

            }

        }
        return finalRes.toString();
  }*/