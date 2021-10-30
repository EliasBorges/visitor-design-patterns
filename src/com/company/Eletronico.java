package com.company;

public class Eletronico extends VisitableFrete {

    public Eletronico(Double valorFrete) {
        super(valorFrete);
    }

    public Double calcularFrete(FreteVisitorProtocol visitor) {
        return visitor.calcularFreteEletronico(this);
    }
}
