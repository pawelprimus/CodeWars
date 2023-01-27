package src.primus.pawel;

import java.util.ArrayList;
import java.util.List;

// Walking in the hallway
// 7kyu
// https://www.codewars.com/kata/6368426ec94f16a1e7e137fc/train/java
// 2023-01-26 T:19:49:41
public class Exercise_500 {

    public static int contact(String hallway) {
        int minSteps = Integer.MAX_VALUE;
        List<Integer> rightSteppers = new ArrayList<>();
        List<Integer> leftSteppers = new ArrayList<>();

        for (int i = 0; i < hallway.length(); i++) {
            char c = hallway.charAt(i);
            if (c == '>') rightSteppers.add(i);
            if (c == '<') leftSteppers.add(i);
        }

        for (Integer rightStepper : rightSteppers) {
            for (Integer leftStepper : leftSteppers) {
                int difference = leftStepper - rightStepper;
                if (difference < minSteps && difference >= 0) {
                    minSteps = difference;
                }
            }
        }

        return minSteps == Integer.MAX_VALUE ? -1 : minSteps/2 + minSteps%2;
    }

    public static void main(String[] args) {
        System.out.println(contact(">-----<-->--<-----"));
        System.out.println(contact(">>-----<<"));
    }
}
