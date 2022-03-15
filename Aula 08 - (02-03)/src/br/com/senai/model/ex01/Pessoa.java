package br.com.senai.model.ex01;

public class Pessoa {

    private String nome;
    private String dataDeNascimento;
    private Endereco endecoPessoa;

    public Pessoa(String nome, String dataDeNascimento, Endereco endecoPessoa){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.endecoPessoa = endecoPessoa;

    }

    public void imprimir(){
        System.out.println("Nome: " + nome +
                "\nData de Nascimento: " + dataDeNascimento +
                "\nEndereço: " + endecoPessoa
        );
    }
}
