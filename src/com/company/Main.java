package com.company;

public class Main {

    public static void main(String[] args) {
        Movel movel = new Movel(10.0);
        Eletronico eletronico = new Eletronico(10.0);

        CalcularFreteMinasGeraisVisitor visitorMg = new CalcularFreteMinasGeraisVisitor();
        CalcularFreteSaoPauloVisitor visitorSp = new CalcularFreteSaoPauloVisitor();

        System.out.println("- Minas Gerais -");
        System.out.println("Movel: " + movel.calcularFrete(visitorMg));
        System.out.println("Eletronico: " + eletronico.calcularFrete(visitorMg));

        System.out.println("\n- São Paulo -");
        System.out.println("Movel: " + movel.calcularFrete(visitorSp));
        System.out.println("Eletronico: " + eletronico.calcularFrete(visitorSp));
    }
}
