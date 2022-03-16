package br.com.senai.model.ex02;

public class Pessoa {

    private String nome;
    private Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    // GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    public void definirEndereco(String rua, int numero, String bairro, String cep){
        endereco = new Endereco(rua, numero, bairro, cep);
    }

    @Override
    public String toString() {
        return nome + endereco;
    }
}
