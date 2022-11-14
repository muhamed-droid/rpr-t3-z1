package ba.unsa.etf.rpr;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println(new FiksniBroj(Grad.DOBOJ, "623-123"));
        //System.out.println(new MobilniBroj(62, "424-141"));
        //System.out.println(new MedunarodniBroj("+387", "62/424-141"));

        TelefonskiBroj t1 = new FiksniBroj("Enes", "Zejnilovic", Grad.SARAJEVO, "400-851");
        TelefonskiBroj t2 = new FiksniBroj("Azur", "Popovic", Grad.SARAJEVO, "401-083");
        TelefonskiBroj t3 = new FiksniBroj("Mihajlo", "Sopic", Grad.SARAJEVO, "401-817");
        TelefonskiBroj t4 = new MobilniBroj("Anastasija", "Rakic" ,62, "424-141");
        TelefonskiBroj t5 = new MobilniBroj("Ivo", "Mehic",62, "424-140");


        Imenik i = new Imenik();

       i.dodaj("Hamdo", t1);


    }
}
