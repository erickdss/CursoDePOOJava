package com.mycompany.aula11;
// se definirmos uma classe final ela não pode ter filhos

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    //metodo que não pode ser sobrescrito
    //public final void pagarMensalidade()
    public void pagarMensalidade() {
        //deixa pegar sem ser pelo get pois a classe anterios o atributo esta como protegido
        System.out.println("Pagando mensalidade do aluno " + this.nome);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
