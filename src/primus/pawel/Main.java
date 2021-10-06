package primus.pawel;

import java.sql.Timestamp;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
     /*   int bitmask = 32;
        int val = 1;
        char a = 'a';
        char A = 'A';
        // prints "2"
        System.out.println("Bitmask " + Integer.toBinaryString(bitmask));
        System.out.println( "val " +Integer.toBinaryString(val));
        System.out.println( "char a " +Integer.toBinaryString((a)));
        System.out.println(A << 64);*/
        Timestamp ts = new Timestamp(1632256605);
        System.out.println(ts.toLocalDateTime());


    }
}
