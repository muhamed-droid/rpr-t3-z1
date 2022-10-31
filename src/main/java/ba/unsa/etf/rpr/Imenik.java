package ba.unsa.etf.rpr;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Imenik {

    private HashMap<String, TelefonskiBroj> brojevi;

    public Imenik() {
        HashMap<String, TelefonskiBroj> brojevi = new HashMap<String, TelefonskiBroj>();
    }

    void dodaj(String ime, TelefonskiBroj broj){
        brojevi.put(ime, broj);
    }
    java.lang.String dajBroj(String ime) {
        return brojevi.get(ime).ispisi();
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

    Set<String> izGrada (Grad g){
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
    }

    /*Set<TelefonskiBroj> izGradaBrojevi(Grad g){

    }  */

}
