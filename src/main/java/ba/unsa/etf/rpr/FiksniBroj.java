package ba.unsa.etf.rpr;

public class FiksniBroj extends TelefonskiBroj{
    private Grad grad;
    private String broj;

    @Override
    public String ispisi() {
        StringBuilder str = new StringBuilder();
        if(grad==Grad.SARAJEVO) str.append("033");
        else if(grad==Grad.ZENICA) str.append("032");
        else if(grad==Grad.TRAVNIK) str.append("030");
        else if(grad==Grad.ODZAK) str.append("031");
        else if(grad==Grad.LIVNO) str.append("034");
        else if(grad==Grad.TUZLA) str.append("035");
        else if(grad==Grad.MOSTAR) str.append("036");
        else if(grad==Grad.BIHAC) str.append("037");
        else if(grad==Grad.GORAZDE) str.append("038");
        else if(grad==Grad.SIROKI_BRIJEG) str.append("039");
        else if(grad==Grad.BRCKO) str.append("049");
        else if(grad==Grad.MRKONJIC_GRAD) str.append("050");
        else if(grad==Grad.BANJA_LUKA) str.append("051");
        else if(grad==Grad.PRIJEDOR) str.append("052");
        else if(grad==Grad.DOBOJ) str.append("053");
        else if(grad==Grad.SAMAC) str.append("054");
        else if(grad==Grad.BIJELJINA) str.append("055");
        else if(grad==Grad.ZVORNIK) str.append("056");
        else if(grad==Grad.PALE) str.append("057");
        else if(grad==Grad.FOCA) str.append("058");
        else if(grad==Grad.TREBINJE) str.append("059");

        str.append("/");
        str.append(broj);
        return str.toString();
    }

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }

    @Override
    public String toString() {
       return this.ispisi();
    }
}
