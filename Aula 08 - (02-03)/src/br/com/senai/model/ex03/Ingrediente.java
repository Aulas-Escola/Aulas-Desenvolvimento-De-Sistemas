package br.com.senai.model.ex03;

public class Ingrediente {

    private String nome;
    private double quantidade;
    private String unidadeMedida;

    public Ingrediente(String nome, double quantidade, String unidadeMedida){
        this.nome = nome;
        this.quantidade = quantidade;
        this.unidadeMedida = unidadeMedida;
    }

    @Override
    public String toString() {
        return  nome + ": " + quantidade +
                ", " + unidadeMedida;
    }
}
