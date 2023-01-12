package com.mycompany.aula02;

public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar() {
        if (tampada == true) {
            System.out.println("ERRO! A Caneta Está Tampada!");
        } else {
            System.out.println("Caneta Rabiscando!");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampada() {
        this.tampada = false;
    }
}
