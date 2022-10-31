package ba.unsa.etf.rpr;

public class MobilniBroj extends TelefonskiBroj{
    private int mobilnaMreza;
    private String broj;
    MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza=mobilnaMreza;
        this.broj=broj;
    }

    @Override
    public String ispisi() {
        StringBuilder str = new StringBuilder();
        str.append("0");
        str.append(mobilnaMreza);
        str.append("/");
        str.append(broj);
        return str.toString();
    }

    @Override
    public String toString() {
       return this.ispisi();
    }
}
