package br.com.senai.model.ex03;

public class Funcionario extends Pessoa{

    private String funcao;
    private double salario;

    public Funcionario(String nome, String sobrenome, String email, String telefone, String funcao, double salario) {
        super(nome, sobrenome, email, telefone);
        this.funcao = funcao;
        this.salario = salario;
    }

    // GETTERS AND SETTERS
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return( "\n" + super.toString() + "\nFunção: " + funcao +
                "\nSalario: " + salario
        );
    }
}
