package primus.pawel;

//https://www.codewars.com/kata/559a28007caad2ac4e000083/train/java

import java.math.BigInteger;
import java.util.ArrayList;

class Exercise_6 {

    public static BigInteger perimeter(BigInteger n) {
        // your code
        ArrayList<BigInteger> result = new ArrayList<BigInteger>();
        BigInteger resBG = new BigInteger("1");

        if(n.equals("0")) return resBG = BigInteger.valueOf(1);
        if(n.equals("1")) return resBG = BigInteger.valueOf(2);
        else {
            result.add(new BigInteger("1"));
            result.add(new BigInteger("1"));
            for (int i = 0; i < n.intValue() ; i++) {
              //  System.out.println(i+" - "+result.get(i));
              //  System.out.println(i+" - "+result.get(i+1));
                result.add((result.get(i).add(result.get(i+1))));
                resBG = resBG.add(result.get(i+1));
                //System.out.println("ResBG = " + resBG);
            }
        }

        //resBG = resBG.multiply(BigInteger.valueOf(4));



           // resBG = result.get(n.intValue());
        resBG = resBG.multiply(BigInteger.valueOf(4));
            return resBG;
    }

    public static void main(String[] args) {

        System.out.println(perimeter(new BigInteger("5")));

    }


}


/*public class SumFct {
    public static BigInteger perimeter(BigInteger n) {

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        for(int i = 0; i <= n.intValue(); i++) {
            a = b;
            b = c;
            c = a.add(b);
            sum = sum.add(a);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }
}*/
