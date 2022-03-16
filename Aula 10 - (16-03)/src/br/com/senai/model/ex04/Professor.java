package br.com.senai.model.ex04;

public class Professor extends Pessoa{

    private int horasTrabalhadas;
    private double valorHora;
    private double salario;

    public Professor(String nome, int horasTrabalhadas, double valorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public void calcularSalario(){
        this.salario = (horasTrabalhadas * valorHora);
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "\nHoras trabalhadas: " + horasTrabalhadas +
                "\nValor da : " + valorHora +
                "\nSalário: " + salario;
    }
}
