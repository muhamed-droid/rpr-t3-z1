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
       FiksniBroj f=new FiksniBroj("Marija", "Kiri", Grad.DOBOJ, "623-123");
       MobilniBroj m = new MobilniBroj("Mehmed", "Kasapovic", 62, "424-141");
       MedunarodniBroj l = new MedunarodniBroj("+387", "62/424-141");
       assertEquals("053/623-123", f.toString());
       assertEquals("062/424-141", m.toString());
       assertEquals("+387 62/424-141", l.toString());
   }

   @Test
   public void Test2() {
       FiksniBroj f3=new FiksniBroj("Marija", "Kiri", Grad.DOBOJ, "623-123");
       FiksniBroj f1=new FiksniBroj("Zehra", "Islamovic", Grad.DOBOJ, "610-103");
       FiksniBroj f2=new FiksniBroj("Petar", "Opacin", Grad.DOBOJ, "123-193");
       Imenik i = new Imenik();
       i.dodaj(f3.getIme() + f3.getPrezime(), f3);
       i.dodaj(f1.getIme() + f1.getPrezime(), f1);
       i.dodaj(f2.getIme()+  f2.getPrezime(), f2);
        assertEquals("1. MarijaKiri - 053/623-123\n", i.naSlovo('M'));
   }
}
