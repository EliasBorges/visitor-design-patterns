package com.company;

public class CalcularFreteSaoPauloVisitor implements FreteVisitorProtocol {

    public Double calcularFreteMovel(Movel movel) {
        return movel.getValorFrete() + movel.getValorFrete() * 1;
    }

    public Double calcularFreteEletronico(Eletronico eletronico) {
        return eletronico.getValorFrete() + eletronico.getValorFrete() * 0.5;
    }

}
