package primus.pawel;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;


// Target Date
// 7kyu
// https://www.codewars.com/kata/569218bc919ccba77000000b/train/java
// 2022-02-15 T:20:57:46
public class Exercise_370 {


    public static String dateNbDays(double a0, double a, double p) {
        int days = 0;
        LocalDate now = LocalDate.of(2016, 1, 1);
        while (a0 < a) {
            a0 =a0+ a0*(p/36000);
            days++;
        }
        return now.plusDays(days).toString();
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests dateNbDays");
        assertEquals(Exercise_370.dateNbDays(100, 101, 0.98), "2017-01-01");
        assertEquals(Exercise_370.dateNbDays(4281, 5087, 2), "2024-07-03");
        assertEquals(Exercise_370.dateNbDays(4620, 5188, 2), "2021-09-19");
        assertEquals(Exercise_370.dateNbDays(9999, 11427, 6), "2018-03-13");
        assertEquals(Exercise_370.dateNbDays(3525, 4822, 3), "2026-04-18");
        assertEquals(Exercise_370.dateNbDays(5923, 6465, 6), "2017-06-10");
        assertEquals(Exercise_370.dateNbDays(4254, 4761, 8), "2017-05-22");
        assertEquals(Exercise_370.dateNbDays(1244, 2566, 4), "2033-11-04");
        assertEquals(Exercise_370.dateNbDays(6328, 7517, 5), "2019-05-25");
        assertEquals(Exercise_370.dateNbDays(2920, 3834, 2), "2029-06-03");
        assertEquals(Exercise_370.dateNbDays(7792, 8987, 4), "2019-07-09");
    }


}
