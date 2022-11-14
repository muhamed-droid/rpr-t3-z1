package ba.unsa.etf.rpr;


import java.util.*;

public class Imenik implements Comparator<TelefonskiBroj>{
    private HashMap<String, TelefonskiBroj> brojevi = new HashMap<String, TelefonskiBroj> (Collections.EMPTY_MAP);

    public Imenik() {
    }

    void dodaj(String ime, TelefonskiBroj broj){
        this.brojevi.put(ime, broj);
    }
    java.lang.String dajBroj(String ime) {
        return this.brojevi.get(ime).ispisi();
    }

    String dajIme(String telefonskiBroj){
        for (Map.Entry<String, TelefonskiBroj> set : brojevi.entrySet()){
            if(telefonskiBroj.equals(set.getValue().ispisi())) return set.getKey();
        }
        return null;
    }

    java.lang.String naSlovo(char s) {
        StringBuilder str = new StringBuilder();
        for (Map.Entry<String, TelefonskiBroj> set : brojevi.entrySet()){
            if(set.getKey().toString().charAt(0)==s){
                str.append("1. ");
                str.append(set.getKey());
                str.append(" - ");
                str.append(set.getValue().ispisi());
                str.append("\n");
            }
        }
        return str.toString();
    }

    @Override
    public int compare(TelefonskiBroj o1, TelefonskiBroj o2) {
        return o1.ispisi().compareTo(o2.ispisi());
    }


    /*Set<String> izGrada (Grad g){
        Set<String> skup = Collections.emptySet();
        for(Map.Entry<String, TelefonskiBroj> set : brojevi.entrySet()){
            if(g==Grad.SARAJEVO) skup.add(set.getKey());
            else if(g==Grad.ZENICA)skup.add(set.getKey());
            else if(g==Grad.TRAVNIK)skup.add(set.getKey());
            else if(g==Grad.ODZAK)skup.add(set.getKey());
            else if(g==Grad.LIVNO)skup.add(set.getKey());
            else if(g==Grad.TUZLA)skup.add(set.getKey());
            else if(g==Grad.MOSTAR)skup.add(set.getKey());
            else if(g==Grad.BIHAC)skup.add(set.getKey());
            else if(g==Grad.GORAZDE)skup.add(set.getKey());
            else if(g==Grad.SIROKI_BRIJEG)skup.add(set.getKey());
            else if(g==Grad.BRCKO)skup.add(set.getKey());
            else if(g==Grad.MRKONJIC_GRAD)skup.add(set.getKey());
            else if(g==Grad.BANJA_LUKA)skup.add(set.getKey());
            else if(g==Grad.PRIJEDOR)skup.add(set.getKey());
            else if(g==Grad.DOBOJ)skup.add(set.getKey());
            else if(g==Grad.SAMAC)skup.add(set.getKey());
            else if(g==Grad.BIJELJINA)skup.add(set.getKey());
            else if(g==Grad.ZVORNIK)skup.add(set.getKey());
            else if(g==Grad.PALE)skup.add(set.getKey());
            else if(g==Grad.FOCA)skup.add(set.getKey());
            else if(g==Grad.TREBINJE)skup.add(set.getKey());
        }
        return skup;
    } */

    public Set<String> izGrada(Grad g){
        Set<String> set = new HashSet<String>();
        for (Map.Entry<String, TelefonskiBroj> broj: this.brojevi.entrySet()) {
            if (broj.getValue().getGrad() == g) {
                set.add(broj.getValue().getIme() + broj.getValue().getPrezime());
            }
        }
        TreeSet<String> treeSet = new TreeSet<String>(set);
        return treeSet;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        Set<TelefonskiBroj> set = new HashSet<TelefonskiBroj>();
        for (Map.Entry<String, TelefonskiBroj> broj: this.brojevi.entrySet()) {
            if (broj.getValue().getGrad() == g) {
                set.add(broj.getValue());
            }
        }
        TreeSet<TelefonskiBroj> treeSet = new TreeSet<TelefonskiBroj>(set);
        return treeSet;
    }

}
