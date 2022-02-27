package primus.pawel;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

// Robotic Tattoo Removal
// 7kyu
// https://www.codewars.com/kata/57658f3dedc6f7a751000e7b/train/java
// 2022-02-24 T:20:34:46
public class Exercise_382 {


    public static String[][] robot(String[][] skinScan) {

        String[][] result = new String[skinScan.length][skinScan[0].length];

        for (int i = 0; i < skinScan.length; i++) {
            for (int j = 0; j < skinScan[i].length; j++) {
                System.out.println(skinScan[i][j]);
                result[i][j] = skinScan[i][j].equals("X") ? "*" : skinScan[i][j];
            }
        }
        return result;
    }

    @Test
    public void basicTests() throws Exception {
        assertArrayEquals(
                new String[][]{
                        {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", "*", "*", " ", " ", " ", "*", "*", " ", " "},
                        {" ", "*", " ", " ", "*", " ", "*", " ", " ", "*", " "},
                        {" ", "*", " ", " ", " ", "*", " ", " ", " ", "*", " "},
                        {" ", "*", " ", " ", " ", "*", " ", " ", " ", "*", " "},
                        {" ", "*", " ", " ", " ", " ", " ", " ", " ", "*", " "},
                        {" ", "*", " ", " ", " ", " ", " ", " ", " ", "*", " "},
                        {" ", "*", " ", " ", " ", " ", " ", " ", " ", "*", " "},
                        {" ", " ", "*", " ", " ", " ", " ", " ", "*", " ", " "},
                        {" ", " ", " ", "*", " ", " ", " ", "*", " ", " ", " "},
                        {" ", " ", " ", " ", "*", " ", "*", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " ", " ", "P", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "}
                },
                Exercise_382.robot(
                        new String[][]{
                                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                                {" ", " ", "X", "X", " ", " ", " ", "X", "X", " ", " "},
                                {" ", "X", " ", " ", "X", " ", "X", " ", " ", "X", " "},
                                {" ", "X", " ", " ", " ", "X", " ", " ", " ", "X", " "},
                                {" ", "X", " ", " ", " ", "X", " ", " ", " ", "X", " "},
                                {" ", "X", " ", " ", " ", " ", " ", " ", " ", "X", " "},
                                {" ", "X", " ", " ", " ", " ", " ", " ", " ", "X", " "},
                                {" ", "X", " ", " ", " ", " ", " ", " ", " ", "X", " "},
                                {" ", " ", "X", " ", " ", " ", " ", " ", "X", " ", " "},
                                {" ", " ", " ", "X", " ", " ", " ", "X", " ", " ", " "},
                                {" ", " ", " ", " ", "X", " ", "X", " ", " ", " ", " "},
                                {" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
                                {" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
                                {" ", " ", " ", " ", " ", " ", " ", " ", " ", "P", " "},
                                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "}
                        }
                )
        );
        assertArrayEquals(
                new String[][]{
                        {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", "*", "*", " ", " ", " ", " ", " "},
                        {" ", " ", " ", "*", " ", " ", "*", " ", " ", " ", " "},
                        {" ", " ", " ", "*", " ", " ", "*", " ", " ", " ", " "},
                        {" ", " ", " ", "*", " ", " ", "*", " ", " ", " ", " "},
                        {" ", " ", " ", "*", " ", " ", "*", " ", " ", " ", " "},
                        {" ", " ", " ", "*", " ", " ", "*", " ", " ", " ", " "},
                        {" ", " ", " ", "*", " ", " ", "*", " ", " ", " ", " "},
                        {" ", " ", " ", "*", " ", " ", "*", " ", " ", " ", " "},
                        {" ", " ", "*", "*", " ", " ", "*", "*", " ", " ", " "},
                        {" ", "*", " ", " ", " ", " ", " ", " ", "*", " ", " "},
                        {" ", "*", " ", " ", " ", " ", " ", " ", "*", " ", " "},
                        {" ", "*", " ", " ", "*", "*", " ", " ", "*", " ", " "},
                        {" ", " ", "*", "*", " ", " ", "*", "*", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "}
                },
                Exercise_382.robot(
                        new String[][]{
                                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                                {" ", " ", " ", " ", "X", "X", " ", " ", " ", " ", " "},
                                {" ", " ", " ", "X", " ", " ", "X", " ", " ", " ", " "},
                                {" ", " ", " ", "X", " ", " ", "X", " ", " ", " ", " "},
                                {" ", " ", " ", "X", " ", " ", "X", " ", " ", " ", " "},
                                {" ", " ", " ", "X", " ", " ", "X", " ", " ", " ", " "},
                                {" ", " ", " ", "X", " ", " ", "X", " ", " ", " ", " "},
                                {" ", " ", " ", "X", " ", " ", "X", " ", " ", " ", " "},
                                {" ", " ", " ", "X", " ", " ", "X", " ", " ", " ", " "},
                                {" ", " ", "X", "X", " ", " ", "X", "X", " ", " ", " "},
                                {" ", "X", " ", " ", " ", " ", " ", " ", "X", " ", " "},
                                {" ", "X", " ", " ", " ", " ", " ", " ", "X", " ", " "},
                                {" ", "X", " ", " ", "X", "X", " ", " ", "X", " ", " "},
                                {" ", " ", "X", "X", " ", " ", "X", "X", " ", " ", " "},
                                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "}
                        }
                )
        );
        assertArrayEquals(
                new String[][]{
                        {" ", "*", " ", " ", " ", "*", " ", " ", " ", "*", " "},
                        {"*", "$", "*", " ", " ", "*", " ", " ", "*", "$", "*"},
                        {" ", "*", " ", " ", " ", "*", " ", " ", " ", "*", " "},
                        {" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
                        {"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"},
                        {"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"},
                        {" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
                        {" ", "*", " ", " ", " ", "*", " ", " ", " ", "*", " "},
                        {"*", "$", "*", " ", " ", "*", " ", " ", "*", "$", "*"},
                        {" ", "*", " ", " ", " ", "*", " ", " ", " ", "*", " "}
                },
                Exercise_382.robot(
                        new String[][]{
                                {" ", "X", " ", " ", " ", "X", " ", " ", " ", "X", " "},
                                {"X", "$", "X", " ", " ", "X", " ", " ", "X", "$", "X"},
                                {" ", "X", " ", " ", " ", "X", " ", " ", " ", "X", " "},
                                {" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
                                {" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
                                {" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
                                {" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
                                {"X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X"},
                                {"X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X"},
                                {" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
                                {" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
                                {" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
                                {" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
                                {" ", "X", " ", " ", " ", "X", " ", " ", " ", "X", " "},
                                {"X", "$", "X", " ", " ", "X", " ", " ", "X", "$", "X"},
                                {" ", "X", " ", " ", " ", "X", " ", " ", " ", "X", " "}
                        }
                )
        );
    }

}