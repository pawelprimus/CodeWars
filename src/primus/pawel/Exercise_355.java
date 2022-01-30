package primus.pawel;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Previous multiple of three
// 7kyu
// https://www.codewars.com/kata/61123a6f2446320021db987d/train/java
// 2022-01-30 T:23:44:30
public class Exercise_355 {

    public static Integer prevMultOfThree(int n) {

        String number = String.valueOf(n);
        int intNum;
        while (number.length() > 0){

            intNum = Integer.parseInt(number);

            if(intNum%3 == 0){
                return intNum;
            }
            number = number.substring(0, number.length()-1);
        }
        return null;
    }

    @Test
    public void basicTest() {
        assertEquals(null, Exercise_355.prevMultOfThree(1), "For input 1");
        assertEquals(null, Exercise_355.prevMultOfThree(25), "For input 25");
        assertEquals(36, Exercise_355.prevMultOfThree(36), "For input 36");
        assertEquals(12, Exercise_355.prevMultOfThree(1244), "For input 1244");
        assertEquals(9, Exercise_355.prevMultOfThree(952406), "For input 952406");
    }

}


