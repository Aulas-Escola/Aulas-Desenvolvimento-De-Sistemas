package br.com.senai;


import br.com.senai.model.questao01.Evento;
import br.com.senai.model.questao02.Pedido;
import br.com.senai.model.questao02.Produto;

public class Main {
    public static void main(String[] args) {

        /* QUESTÃO 01*/


        Evento formatura = new Evento("Formatura", "Oceania", "10/12/2022");
        formatura.adicionarCliente("Igor Medeiros Ribeiro", "123.231.234-12", "(48) 99627-9325", "igorribeiro632@gmail.com");
        formatura.adicionarCliente("Maria Eduarda Borges", "123.456.789-10", "(48) 99643-6578", "duda.pborges92@gmail.com");
        formatura.adicionarCliente("Ismael Teixeira da Silva", "123.231.234-13", "(48) 99738-2342", "ismaelteixeiradas1@gmail.com");
        formatura.adicionarCliente("Thiago Henrique de Paula Fernandes", "971.762.261-22", "(48) 94952-8692", "thiagohpfernandes@gmail.com");
        formatura.adicionarCliente("Matheus Augusto Elias Mello", "921.214.672-21", "(48) 96173-5974", "matheusaemello@gmail.com");
        formatura.imprimir();

        System.out.println("\n\n<---------------------------------------------------------------------------------------------------->\n");

        Evento feriasdejulho = new Evento("férias de Julho", "Casa no lago","08/07/2022" );
        feriasdejulho.adicionarCliente("Igor Medeiros Ribeiro", "123.231.234-12", "(48) 99627-9325", "igorribeiro632@gmail.com");
        feriasdejulho.adicionarCliente("Maria Eduarda Borges", "123.456.789-10", "(48) 99643-6578", "duda.pborges92@gmail.com");
        feriasdejulho.adicionarCliente("Ismael Teixeira da Silva", "123.231.234-13", "(48) 99738-2342", "ismaelteixeiradas1@gmail.com");
        feriasdejulho.adicionarCliente("Thiago Henrique de Paula Fernandes", "971.762.261-22", "(48) 94952-8692", "thiagohpfernandes@gmail.com");
        feriasdejulho.adicionarCliente("Matheus Augusto Elias Mello", "921.214.672-21", "(48) 96173-5974", "matheusaemello@gmail.com");
        feriasdejulho.imprimir();

        System.out.println("\n\n<---------------------------------------------------------------------------------------------------->\n");


        Evento pascoa = new Evento("Páscoa", "Bosque","17/04/2022");
        pascoa.adicionarCliente("Igor Medeiros Ribeiro", "123.231.234-12", "(48) 99627-9325", "igorribeiro632@gmail.com");
        pascoa.adicionarCliente("Maria Eduarda Borges", "123.456.789-10", "(48) 99643-6578", "duda.pborges92@gmail.com");
        pascoa.adicionarCliente("Ismael Teixeira da Silva", "123.231.234-13", "(48) 99738-2342", "ismaelteixeiradas1@gmail.com");
        pascoa.adicionarCliente("Thiago Henrique de Paula Fernandes", "971.762.261-22", "(48) 94952-8692", "thiagohpfernandes@gmail.com");
        pascoa.adicionarCliente("Matheus Augusto Elias Mello", "921.214.672-21", "(48) 96173-5974", "matheusaemello@gmail.com");
        pascoa.imprimir();


        /* QUESTÃO 02 */

        /*
        Pedido pedido1 = new Pedido("Lista de compras do mês", "15/03/2022");
        Produto produto1 = new Produto("Iphone 13 Pro", 9.176);
        pedido1.setProduto(produto1, 3);
        Produto produto2 = new Produto("Ipad Air", 6.799);
        pedido1.setProduto(produto2, 1);
        Produto produto3 = new Produto("Apple Watch", 5.099);
        pedido1.setProduto(produto3, 5);
        Produto produto4 = new Produto("Apple Studio Display", 20.999);
        pedido1.setProduto(produto4, 1);
        Produto produto5 = new Produto("MacBook Pro", 25.979);
        pedido1.setProduto(produto5, 1);
        Produto produto6 = new Produto("Magic Keyboard",  2.239);
        pedido1.setProduto(produto6, 1);
        Produto produto7 = new Produto("Magic Mouse", 1.099);
        pedido1.setProduto(produto7, 5);
        Produto produto8 = new Produto("AirPods Pro", 2.870);
        pedido1.setProduto(produto8, 2);
        Produto produto9 = new Produto("Apple TV 4K", 2.296);
        pedido1.setProduto(produto9, 1);
        Produto produto10 = new Produto("Bateria real 500plus", 1.163);
        pedido1.setProduto(produto10, 3);
        System.out.println("Pedido 1: ");
        pedido1.verProdutos();
        System.out.println("\nPedido 1 faturado: " + pedido1.faturarPedido());

        Pedido pedido2 = new Pedido("Lista de compras do mês", "15/03/2022");
        Produto produto11 = new Produto("Iphone 13 Pro", 9.176);
        pedido2.setProduto(produto11, 1);
        Produto produto12 = new Produto("Ipad Air", 6.799);
        pedido2.setProduto(produto12, 1);
        Produto produto13 = new Produto("Apple Watch", 5.099);
        pedido2.setProduto(produto13, 1);
        Produto produto14 = new Produto("Apple Studio Display", 20.999);
        pedido2.setProduto(produto14, 1);
        Produto produto15 = new Produto("MacBook Pro", 25.979);
        pedido2.setProduto(produto15, 1);
        Produto produto16 = new Produto("Magic Keyboard",  2.239);
        pedido2.setProduto(produto16, 1);
        Produto produto17 = new Produto("Magic Mouse", 1.099);
        pedido2.setProduto(produto17, 2);
        Produto produto18 = new Produto("AirPods Pro", 2.870);
        pedido2.setProduto(produto18, 1);
        Produto produto19 = new Produto("Apple TV 4K", 2.296);
        pedido2.setProduto(produto19, 5);
        Produto produto20 = new Produto("Bateria MagSafe", 1.163);
        pedido2.setProduto(produto20, 1);
        System.out.println("\nPedido 2: ");
        pedido2.verProdutos();
        System.out.println("\nPedido 2 faturado: " + pedido2.faturarPedido());
        */


    }
}