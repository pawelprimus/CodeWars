package primus.pawel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// Four/Seven
// 7kyu
// https://www.codewars.com/kata/5ff50f64c0afc50008861bf0/train/java
// 2022-02-03 T:23:32:34
class Exercise_360_todo {

    public static int fourSeven(int n) {

        System.out.println(n);
        String result = String.valueOf(n)
                .replaceAll("7", "s")
                .replaceAll("4", "7")
                .replaceAll("s", "4");

        return Integer.parseInt(result);
    }

    @Test
    public void exampleTests() {
        assertEquals(Exercise_360_todo.fourSeven(7), 4);
        assertEquals(Exercise_360_todo.fourSeven(4), 7);
        assertEquals(Exercise_360_todo.fourSeven(70), 0);
    }
}
