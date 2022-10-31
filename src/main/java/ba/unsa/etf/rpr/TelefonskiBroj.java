package ba.unsa.etf.rpr;


import java.util.Objects;

public class TelefonskiBroj {
    private Grad grad;
    String broj;

    public String ispisi(){
       return broj;
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
