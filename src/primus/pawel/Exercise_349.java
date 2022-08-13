package primus.pawel;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

// Dead Ants
// 6kyu
// https://www.codewars.com/kata/57d5e850bfcdc545870000b7/train/java
// 2022-01-23 T:22:35:10
class Exercise_349 {

    public static int deadAntCount(final String ants) {
        if(ants == null || ants.length() == 0){
            return 0;
        }
        String partsOfAnts = ants.replaceAll("ant", "");
        long aSum = partsOfAnts.chars().filter(ch -> ch == 'a').count();
        long nSum = partsOfAnts.chars().filter(ch -> ch == 'n').count();
        long tSum = partsOfAnts.chars().filter(ch -> ch == 't').count();

        return Math.toIntExact(Arrays.asList(aSum, nSum, tSum).stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).stream().findFirst().orElse(0l));
        //return (int) Math.max(aSum,Math.max(nSum, tSum));
    }

    public static void main(String[] args) {
        System.out.println(deadAntCount("ant a ant anatttt"));
    }
}

