package src.primus.pawel;

// Survive the attack
// 7kyu
// https://www.codewars.com/kata/634d0f7c562caa0016debac5
// 2023-01-11 T:23:56:14

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise_489 {
    public static boolean block(int[] attackers, int[] defenders) {
        long powerOfAttacker = 0;
        if (attackers.length > 0) {
            powerOfAttacker = Arrays.stream(attackers).boxed().toList().stream().reduce(Integer::sum).get();
        }
        long powerOfDefender = 0;
        if (defenders.length > 0) {
            powerOfDefender = Arrays.stream(defenders).boxed().toList().stream().reduce(Integer::sum).get();
        }
        for (int i = 0; i < Math.min(attackers.length, defenders.length); i++) {
            int attacker = attackers[i];
            int defender = defenders[i];

            if (attacker != defender) {
                if (attacker > defender) {
                    defenders[i] = -1;
                } else {
                    attackers[i] = -1;
                }
            }
        }

        long amountOfAttacker = Arrays.stream(attackers).boxed().toList().stream().filter(i -> i >= 0).count();
        long amountOfDefender = Arrays.stream(defenders).boxed().toList().stream().filter(i -> i >= 0).count();

        if (amountOfAttacker == amountOfDefender) {
            return powerOfAttacker == powerOfDefender || powerOfDefender > powerOfAttacker;
        } else {
            return amountOfDefender > amountOfAttacker;
        }
    }

    public static void main(String[] args) {

        System.out.println(block(new int[]{0}, new int[]{}));
    }

}
