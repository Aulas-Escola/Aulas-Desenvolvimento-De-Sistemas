package br.com.senai.model.ex02;


import java.text.DecimalFormat;
import java.util.ArrayList;

public class Pedido {
    private String descricao;
    private String data;
    private double total;
    private ItensDoPedido itensDoPedido;

    public Pedido(String descricao, String data){
        this.descricao = descricao;
        this.data = data;
        this.itensDoPedido = new ItensDoPedido();
    }

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public String getData() {return data;}

    public void setData(String data) {this.data = data;}

    public double faturarPedido(){
        return this.total;
    }

    public void setProduto(Produto produto, int quantidade) {
        for (int i = 1; i <= quantidade; i++) {
            this.total += produto.getPreco();
            this.itensDoPedido.setProdutos(produto);
        }
    }

    public boolean verProdutos(){
        System.out.println(this.itensDoPedido.getProdutos());
        return true;
    }

    @Override
    public String toString() {
        return "Pedido" +
                "\nDescricao: " + descricao  +
                "\nData: " + data +
                "\nTotal: " + total +
                ", itensDoPedido=" + itensDoPedido +
                "}";
    }
}
