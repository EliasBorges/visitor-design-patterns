package com.company;

public class Movel extends VisitableFrete{
    public Movel(Double valorFrete){
        super(valorFrete);
    }

    public Double calcularFrete(FreteVisitorProtocol visitor) {
        return visitor.calcularFreteMovel(this);
    }
}
