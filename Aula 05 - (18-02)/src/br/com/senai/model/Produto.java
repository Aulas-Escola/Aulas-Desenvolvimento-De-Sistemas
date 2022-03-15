package br.com.senai.model;

import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;

    public Object setTeste(Object objeto) {
        return objeto;
    }

    public void setAtributos(int i) {
        Scanner scNum = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        System.out.print("\nNome do produto " + i + ": ");
        String nomeDoProduto = scStr.nextLine();
        this.nome = nomeDoProduto;

        System.out.print("\nPreço do produto " + i + ": ");
        Double precoDoProduto = scNum.nextDouble();
        this.preco = precoDoProduto;
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
