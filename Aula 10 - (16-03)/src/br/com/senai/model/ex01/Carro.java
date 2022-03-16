package br.com.senai.model.ex01;

public class Carro extends Veiculo{

    private int portas;

    public Carro(String nome, int portas) {
        super(nome);
        this.portas = portas;
    }

    // GETTERS AND SETTERS
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nQuantidade de portas: " + portas;
    }
}
