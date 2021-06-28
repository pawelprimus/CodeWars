package primus.pawel;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    public void Exercise21() {
        assertEquals(")()())()(()()(",
                Exercise_021.encode("Prespecialized"));
        assertEquals("))))())))", Exercise_021.encode("   ()(   "));
    }

    @Test
    public void Exercise22(){
        assertEquals('d', Exercise_022.MorseCodeChar("-.."));
        assertEquals('q', Exercise_022.MorseCodeChar("--.-"));
        assertEquals("HEY JUDE", Exercise_022.decode(".... . -.--   .--- ..- -.. ."));
    }

    @Test void Exercise23(){
        assertEquals("t", Exercise_023.getMiddle("testing"));
    }

    @Test void Exercise055(){
        assertEquals("9", Exercise_055.getWeight("9"));
        assertEquals("0", Exercise_055.getWeight("0"));
        assertEquals("16", Exercise_055.getWeight("4444"));

    }

    @Test void Exercise058(){
        assertEquals(true, Exercise_058.arrayMadness(new int[]{4, 5, 6}, new int[]{1, 2, 3}));
        assertEquals(false, Exercise_058.arrayMadness(new int[]{5,6,7}, new int[]{4,5,6}));
        assertEquals(false, Exercise_058.arrayMadness(new int[]{4,5,6}, new int[]{3,4,5}));

    }

    @Test void Exercise83(){
        assertEquals(true, Exercise_083.checkIfPalindrome("abba"));
        assertEquals(true, Exercise_083.checkIfPalindrome("abbba"));
        assertEquals(false, Exercise_083.checkIfPalindrome("abbla"));
        assertEquals(false, Exercise_083.checkIfPalindrome("abblas"));

    }

    @Test void Exercise85(){

        assertEquals(Exercise_085.availableMoves(null), new ArrayList<String>() );
        assertEquals(Exercise_085.availableMoves("work?"), new ArrayList<String>() );
        assertEquals(Exercise_085.availableMoves("A10"), new ArrayList<String>() );
        assertEquals(Exercise_085.availableMoves("B0"), new ArrayList<String>() );
        assertEquals(Exercise_085.availableMoves("2"), new ArrayList<String>() );

        assertEquals(Exercise_085.availableMoves("A1"), Arrays.asList( "A2", "A3", "A4", "A5", "A6", "A7", "A8", "B1",
                "B2", "C1", "C3", "D1", "D4", "E1", "E5", "F1", "F6", "G1", "G7", "H1", "H8")  );

        assertEquals(Arrays.asList( "A3", "A5", "A7", "B4", "B5", "B6", "C1",
                "C2", "C3", "C4", "C6", "C7", "C8", "D4", "D5", "D6", "E3", "E5", "E7", "F2", "F5", "F8",
                "G1", "G5", "H5" ), Exercise_085.availableMoves("C5"));


    }

    @Test void Exercise_164(){

            assertEquals("10 + 2", Exercise_164.expandedForm(12));
            assertEquals("40 + 2", Exercise_164.expandedForm(42));
            assertEquals("70000 + 300 + 4", Exercise_164.expandedForm(70304));
        }

    }


