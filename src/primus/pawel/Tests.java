package primus.pawel;

import org.junit.jupiter.api.Test;

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


}