package br.com.senai.model.ex01;

public class Caminhao extends Veiculo{

    private int eixos;

    public Caminhao(String nome, int eixos) {
        super(nome);
        this.eixos = eixos;
    }

    // GETTERS AND SETTERS
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nQuantidade de eixos: " + eixos;
    }
}
