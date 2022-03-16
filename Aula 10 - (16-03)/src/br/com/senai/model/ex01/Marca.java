package br.com.senai.model.ex01;

public class Marca {

    private String nome;
    private String descricao;

    //  CONSTRUTOR
    public Marca(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    //  GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return nome + "\nDescrição: " + descricao;
    }
}
