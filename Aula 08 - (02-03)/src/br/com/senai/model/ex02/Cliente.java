package br.com.senai.model.ex02;

public class Cliente {

    private String nome;
    private String cpf;
    private Conta conta;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void contaCliente(Conta conta){
        this.conta = conta;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome +
        "\nCPF: " + cpf +
        "\n\nInformações da conta: " + conta);
    }
}
