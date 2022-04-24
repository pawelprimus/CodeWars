package primus.pawel;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

// Cat Years, Dog Years (2)
// 7kyu
// https://www.codewars.com/kata/5a6d3bd238f80014a2000187
// 2022-04-24 T:14:39:46
public class Exercise_431 {

    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {


        return new int[]{calculateCat(catYears), calculateDogToHumanYears(dogYears)};
    }

    private static int calculateDogToHumanYears(final int dogYears) {
        if (dogYears < 15) {
            return 0;
        }
        if (dogYears < 24) {
            return 1;
        }

        return ((dogYears - 24) / 5) + 2;
    }
    private static int calculateCat(final int dogYears) {

        if (dogYears < 15) {
            return 0;
        }
        if (dogYears < 24) {
            return 1;
        }

        return ((dogYears - 24) / 4) + 2;
    }



    @Test
    public void one() {
        assertArrayEquals(new int[]{1, 1}, Exercise_431.ownedCatAndDog(15, 15));
    }

    @Test
    public void two() {
        assertArrayEquals(new int[]{2, 2}, Exercise_431.ownedCatAndDog(24, 24));
    }

    @Test
    public void ten() {
        assertArrayEquals(new int[]{10, 10}, Exercise_431.ownedCatAndDog(56, 64));
    }

}
