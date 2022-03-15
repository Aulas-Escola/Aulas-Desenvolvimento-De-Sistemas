package br.com.senai.model.questao02;

import java.util.ArrayList;

public class ItensDoPedido {
    public ArrayList<Produto> produtos;
    private int quantidade;

    public ItensDoPedido(){
        this.produtos = new ArrayList<Produto>();
    }

    public void setProdutos(Produto produto) {
        this.produtos.add(produto);
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "ItensDoPedido: " +
                "\nProdutos=" + produtos +
                "\nQuantidade=" + quantidade;
    }
}
