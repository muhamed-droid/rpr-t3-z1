package ba.unsa.etf.rpr;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

   @Test
    public void Test1() {
       FiksniBroj f=new FiksniBroj(Grad.DOBOJ, "623-123");
       MobilniBroj m = new MobilniBroj(62, "424-141");
       MedunarodniBroj l = new MedunarodniBroj("+387", "62/424-141");
       assertEquals("053/623-123", f.toString());
       assertEquals("062/424-141", m.toString());
       assertEquals("+387 62/424-141", l.toString());
   }


}
