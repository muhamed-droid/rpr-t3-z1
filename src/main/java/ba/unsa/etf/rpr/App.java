package ba.unsa.etf.rpr;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(new FiksniBroj(Grad.DOBOJ, "623-123"));
        System.out.println(new MobilniBroj(62, "424-141"));
        System.out.println(new MedunarodniBroj("+387", "62/424-141"));
    }
}
