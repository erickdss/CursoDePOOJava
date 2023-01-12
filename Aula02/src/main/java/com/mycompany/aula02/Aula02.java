package com.mycompany.aula02;

public class Aula02 {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();

        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 50;
        c1.tampar();

        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();

        c2.modelo = "Faber Castell";
        c2.cor = "Preta";
        c2.ponta = 0.7f;
        c2.carga = 100;
        c2.destampada();

        c2.status();
        c2.rabiscar();

    }
}
