package com.company;

public class CalcularFreteMinasGeraisVisitor implements FreteVisitorProtocol {
    public Double calcularFreteMovel(Movel movel) {
        return movel.getValorFrete() + movel.getValorFrete() * 2;
    }

    public Double calcularFreteEletronico(Eletronico eletronico) {
        return eletronico.getValorFrete() + eletronico.getValorFrete() * 1;
    }
}
