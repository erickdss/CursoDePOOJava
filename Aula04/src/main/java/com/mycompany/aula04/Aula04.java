package com.mycompany.aula04;

public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);
//        c1.setModelo("BIC");// ACESSANDO O ATRIBUTO UTILIZANDO O MÉTODO ACESSOR
//        c1.modelo = "BIC";// ACESSANDO DIRETAMENTE O ATRIBUTO
//        
//        c1.setPonta(0.5f);//ACESSANDO O ATRIBUTO ATRAVÉS DO MÉTODO ACESSOR
//        //c1.ponta = 0.5f;//AO TENTAR ACESSAR O ATRIBUTO PRIVADO DIRETAMENTE DA ERRO
//        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        c1.status();
    }
}
