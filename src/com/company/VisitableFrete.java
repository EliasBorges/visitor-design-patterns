package com.company;

abstract class VisitableFrete {
    Double valorFrete;

    VisitableFrete(Double valorFrete){
        this.valorFrete = valorFrete;
    }

    public Double getValorFrete(){
        return this.valorFrete;
    }

    abstract public Double calcularFrete(FreteVisitorProtocol visitor);
}
