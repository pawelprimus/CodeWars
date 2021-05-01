package primus.pawel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
// Next bigger number with the same digits
// 4 kyu
//https://www.codewars.com/kata/55983863da40caa2c900004e/train/java
// 2021-04-29 T:21:44:25
class Exercise_003_todo {


    public static long nextBiggerNumber(long n)
    {
        String number = String.valueOf(n);
        for (int i = 0; i < number.length(); i++) {

        }


        return n;
    }






   /* public static long nextBiggerNumber(long n)
    {
        long result = 0;
        int smallestNum = 9;
        int i = 1;
        int index = 1;
        long tmp = 0;
        List<Integer> numbersArray = Arrays.asList();
        while(n > 0) {

            tmp = n % 10;
            if(tmp < smallestNum) {
                smallestNum = (int)tmp;
                index = i;
            }


            System.out.println(tmp);
            //result += tmp * tmp;
            n /= 10;
            i++;
        }
        System.out.println("Smallest num: " + smallestNum + " index: " + index);


        return n;
    }*/
/*
    public static long nextBiggerNumber(long n)
    {
        String numStr = Long.toString(n);
        StringBuilder sB = new StringBuilder(numStr);
        int smallestNum = 9;
        int indexSmall = 1;
        int indexBig = 1;
        int number;

        return n;
    }*/

    public static void main(String[] args) {

        nextBiggerNumber(19009);

    }
}
