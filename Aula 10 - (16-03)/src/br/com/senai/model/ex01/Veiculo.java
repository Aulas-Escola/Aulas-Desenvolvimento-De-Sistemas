package br.com.senai.model.ex01;

public class Veiculo {

    private String nome;
    private Marca marca;

    public Veiculo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void definirMarca(String nome, String descricao){
        marca = new Marca(nome, descricao);
    }

    @Override
    public String toString() {
        return "\n" + nome + "\nMarca: " + marca;
    }
}
