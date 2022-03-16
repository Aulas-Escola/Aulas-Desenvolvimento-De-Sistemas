package br.com.senai.model.ex04;

public class Aluno extends Pessoa{

    private double nota1;
    private double nota2;
    private double media;

    public Aluno(String nome, double nota1, double nota2) {
        super(nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void calcularMedia(){
        this.media = (nota1 + nota2) / 2;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + ": \nNota 01 = " + nota1 +
                "\nNota 02 = " + nota2 +
                "\nMedia = " + media;
    }
}
