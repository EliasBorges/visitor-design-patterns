package com.company;

public class Main {

    public static void main(String[] args) {
        Movel movel = new Movel(10.0);
        Eletronico eletronico = new Eletronico(10.0);

        CalcularFreteMinasGeraisVisitor visitorMg = new CalcularFreteMinasGeraisVisitor();
        CalcularFreteSaoPauloVisitor visitorSp = new CalcularFreteSaoPauloVisitor();

        System.out.println("- Frete sem Taxa -");
        System.out.println("Movel: R$" + movel.getValorFrete());
        System.out.println("Eletronico: R$" + eletronico.getValorFrete());

        System.out.println("\n- Minas Gerais -");
        System.out.println("Movel: R$" + movel.calcularFrete(visitorMg));
        System.out.println("Eletronico: R$" + eletronico.calcularFrete(visitorMg));

        System.out.println("\n- São Paulo -");
        System.out.println("Movel: R$" + movel.calcularFrete(visitorSp));
        System.out.println("Eletronico: R$" + eletronico.calcularFrete(visitorSp));
    }
}
