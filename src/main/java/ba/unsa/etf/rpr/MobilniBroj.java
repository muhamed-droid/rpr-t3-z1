package ba.unsa.etf.rpr;

public class MobilniBroj extends TelefonskiBroj{
    private String ime, prezime;
    private int mobilnaMreza;
    private String broj;
    MobilniBroj(String ime, String prezime, int mobilnaMreza, String broj) {
        this.ime= ime;
        this.prezime = prezime;
        this.mobilnaMreza=mobilnaMreza;
        this.broj=broj;
    }

    @Override
    public String getIme(){
        return ime;
    }

    @Override
    public String getPrezime(){
        return prezime;
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
