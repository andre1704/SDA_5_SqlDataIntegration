import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andre on 08.03.2017.
 */
public class AlfabetMorsaTest {
    @Test
    public  void testDuzychLiter(){
        String nov="AA";
        String trans=".-.-";
        String ne=AlfabetMorsa.zamianaNaMorsa(nov);
        assertEquals(trans,ne);
    }

}