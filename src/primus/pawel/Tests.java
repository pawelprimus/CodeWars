package primus.pawel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    public void Exercise21() {
        assertEquals(")()())()(()()(",
                Exercise_21.encode("Prespecialized"));
        assertEquals("))))())))",Exercise_21.encode("   ()(   "));
    }

    @Test
    public void Exercise22(){
        assertEquals('d', Exercise_22.MorseCodeChar("-.."));
        assertEquals('q', Exercise_22.MorseCodeChar("--.-"));
        assertEquals("HEY JUDE", Exercise_22.decode(".... . -.--   .--- ..- -.. ."));
    }

    @Test void Exercise23(){
        assertEquals("t", Exercise_23.getMiddle("testing"));
    }


}