package ba.unsa.etf.rpr;


import java.util.Objects;

public class TelefonskiBroj {
    private String ime, prezime;
    private Grad grad;
    private String broj;

    public String ispisi(){
       return broj;
    }

    public Grad getGrad(){
        return grad;
    }

    public String getBroj(){
        return broj;
    }

    public String getIme(){
        return ime;
    }

    public String getPrezime(){
        return prezime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelefonskiBroj that = (TelefonskiBroj) o;
        return Objects.equals(broj, that.broj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(broj);
    }
}
