package br.com.sistema.model;

public class Veiculo {
    //Atribuos

    private String placa;
    private int velocidade;
    //Métodos

    public String novaPlaca(String placaAtualizada){
        placa = placaAtualizada;
        return placa;
    }
    public String getPlaca(){
        return this.placa;
    }

    public int acelar(int valor){
        velocidade += valor;
        return velocidade;
    }
    public int frear(int valor){
        velocidade -= valor;
        return velocidade;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}