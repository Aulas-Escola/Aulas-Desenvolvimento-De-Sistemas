package br.com.senai.model;

public class Produto {
    private String nome;
    private double preco;

    public Object setTeste(Object objeto) {
        return objeto;
    }

    public void setAtributos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
