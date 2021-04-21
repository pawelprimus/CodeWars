package primus.pawel;
// makeBackronym
// 7kyu
// https://www.codewars.com/kata/55805ab490c73741b7000064/train/java
// 2021-04-22 T:00:12:14

import java.util.Map;




class Exercise_093_todo {


    public class Fraction implements Comparable<Fraction>
    {
        private final long top;
        private final long bottom;

        public Fraction(long numerator, long denominator) {
            top = numerator;
            bottom = denominator;
        }

        @Override
        public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }
        @Override
        public boolean equals(Object o) { return compareTo((Fraction)o) == 0; }
        @Override
        public int compareTo(Fraction f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }

        // Your work here!

        //Add two fractions
        public Fraction add(Fraction f2) {
    //todo
            return null;
        }


        @Override
        public String toString() {
        return this.top + "/" + this.bottom;
        }


        //...and make this class string representable
    }

    public static void main(String[] args) {

    }

}
