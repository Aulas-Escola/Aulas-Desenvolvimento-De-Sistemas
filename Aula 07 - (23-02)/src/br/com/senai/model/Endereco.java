package br.com.senai.model;

import java.util.Scanner;

public class Endereco {

    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;

    public void  cadastroEndereco(){
        Scanner scNum = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        System.out.println("\n\nCadastro de Endereço");
        System.out.print("\nDigite o nome da sua rua: ");
        String ruaInformada = scStr.nextLine();
        this.rua = ruaInformada;

        System.out.print("\nDigite o número da sua casa: ");
        int numeroInformado = scNum.nextInt();
        this.numero = numeroInformado;

        System.out.print("\nInforme o nome do seu bairro: ");
        String bairroInformado = scStr.nextLine();
        this.bairro = bairroInformado;

        System.out.print("\nInforme o nome da cidade: ");
        String cidadeInformada = scStr.nextLine();
        this.cidade = cidadeInformada;

        System.out.print("\nInforme um complemento: ");
        String complementoInformado = scStr.nextLine();
        this.complemento = complementoInformado;
    }

    @Override
    public String toString() {
        return  rua + ", "+
                numero + ", " +
                bairro + ", " +
                cidade + ", " +
                complemento;
    }
}
