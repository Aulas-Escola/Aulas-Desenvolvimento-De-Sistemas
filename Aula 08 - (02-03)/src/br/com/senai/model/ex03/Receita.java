package br.com.senai.model.ex03;

import java.util.ArrayList;

public class Receita {

    private String nome;
    private String descricao;
    private String modoDePreparo;
    private ArrayList<Ingrediente> ingredientes;

    public Receita(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;

        ingredientes = new ArrayList<>();
    }

    public void setIngrediente(String nome, double quantidade, String um){
        Ingrediente ingrediente = new Ingrediente(nome, quantidade, um);
        ingredientes.add(ingrediente);
    }

    public void setPreparo(String modo){
        this.modoDePreparo = modo;
    }

    public void imprimir(){
        System.out.println("\n" + nome + " - " + descricao);
        ingredientes.forEach(ingrediente -> System.out.println(ingrediente));
        System.out.println(modoDePreparo);
    }
}
