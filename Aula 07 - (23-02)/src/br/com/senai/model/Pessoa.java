package br.com.senai.model;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String telefone;
    private String rg;
    private Endereco endereco;

    public void cadastroPessoa(){
        Scanner scStr = new Scanner(System.in);

        System.out.println("\n\nCadastro de Usuário");

        System.out.print("\nDigite Seu nome: ");
        String nomeInformado = scStr.nextLine();
        this.nome = nomeInformado;

        System.out.print("\nDigite seu RG: ");
        String rgInformado = scStr.nextLine();
        this.rg = rgInformado;

        System.out.print("\nDigite seu telefone: ");
        String telefoneInformado = scStr.nextLine();
        this.telefone = telefoneInformado;

    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprimir(){
        System.out.println("\n\nNovo Usuário Cadastrado!!");
        System.out.println("\nNome: " + nome +
                "\nTelefone: " + telefone +
                "\nRG: " + rg +
                "\nEndereço: " + endereco);
    }
}
