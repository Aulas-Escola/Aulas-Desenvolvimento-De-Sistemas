package br.com.senai;

import br.com.senai.model.Cliente;
import br.com.senai.model.Conta;
import br.com.senai.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class Main  {

    /*
    public static void main(String [] args){
        Conta contaIgor = new Conta();

        contaIgor.setNumeroConta("123-4");
        contaIgor.setNumeroAgencia("12345-6");
        contaIgor.depositar(234);
        System.out.println("Saldo Atual: " + contaIgor.getSaldo());
        contaIgor.sacar(45);
        System.out.println("Saldo Atual: " + contaIgor.getSaldo());
    }


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

        List<Object> arrayPreco = new ArrayList<Object>();
        List<Object> arrayNome = new ArrayList<Object>();

        Produto produto1 = new Produto();
        produto1.setAtributos("Batata", 10);

        Produto produto2 = new Produto();
        produto2.setAtributos("Arroz", 20);

        Produto produto3 = new Produto();
        produto3.setAtributos("Feijão", 10);

        Produto produto4 = new Produto();
        produto4.setAtributos("Macarrão", 5);

        arrayPreco.add(produto1.getPreco());
        arrayPreco.add(produto2.getPreco());
        arrayPreco.add(produto3.getPreco());
        arrayPreco.add(produto4.getPreco());

        arrayNome.add(produto1.getNome());
        arrayNome.add(produto2.getNome());
        arrayNome.add(produto3.getNome());
        arrayNome.add(produto4.getNome());

        int todosOsProdutos = 0;
        for (int i = 0; i < arrayPreco.size(); i++){

            System.out.println("Produto "+ arrayNome.get(i) + " " + arrayPreco.get(i));

            todosOsProdutos += (double) arrayPreco.get(i);
        }
        System.out.println("O valor de todos os produtos juntos é: " + todosOsProdutos);


    }
}
