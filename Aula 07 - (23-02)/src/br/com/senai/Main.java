package br.com.senai;


import br.com.senai.model.Endereco;
import br.com.senai.model.Pessoa;

public class Main {

    public static void main(String[] args) {
        Pessoa igor = new Pessoa();
        igor.cadastroPessoa();

        Endereco enderecoIgor = new Endereco();
        enderecoIgor.cadastroEndereco();

        igor.setEndereco(enderecoIgor);
        igor.imprimir();
    }

}
