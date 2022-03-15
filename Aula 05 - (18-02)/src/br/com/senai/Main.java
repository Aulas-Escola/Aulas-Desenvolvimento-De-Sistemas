package br.com.senai;

import br.com.senai.model.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main  {

    /*
    public static void main(String [] args){
        Conta contaIgor = new Conta();

        contaIgor.setNumeroConta("123-4");
        contaIgor.setNumeroAgencia("12345-6");
        contaIgor.depositar(234);
        System.out.println("Saldo Atual: " + contaIgor.getSaldo());
        contaIgor.sacar(45) ;
        System.out.println("Saldo Atual: " + contaIgor.getSaldo());
    }
    */
    /*
    public static void main (String [] args){
        Cliente ismael = new Cliente();
        ismael.setNome("Ismael Teixeira Silva");
        System.out.println(ismael.getNome());
        ismael.setEmail("dfgjisfduiogsfd@gmail.com");
        System.out.println(ismael.getEmail());
        ismael.setTelefone("55+ (48) 99189-1499");
        System.out.println(ismael.getTelefone());
        ismael.setIdade(17);
        System.out.println(ismael.getIdade());
    }
    */

    public static void main( String [] args){

        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        Produto produto4 = new Produto();
        Produto produto5 = new Produto();

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);

        int todosOsProdutos = 0;
        for (int i = 0; i < produtos.size(); i++){
            int num = i + 1;
            produtos.get(i).setAtributos(num);
            System.out.println("\nProduto " + num + ": " + produtos.get(i).getNome() + ", Preço: " + produtos.get(i).getPreco());
            todosOsProdutos += produtos.get(i).getPreco();
        }
        System.out.println(produtos);
        System.out.print("O valor de todos os produtos juntos é: " + todosOsProdutos);

    }

}
