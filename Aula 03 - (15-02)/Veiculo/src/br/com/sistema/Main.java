package br.com.sistema;

import br.com.sistema.model.Veiculo;

public class Main {
    public static void main(String args []){
        // escrevendo sout cria isso automaticamente
        // System.out.println("escrevendo sout cria um console.log automaticamente");

        Veiculo veiculo = new Veiculo();
        System.out.println("Placa adicionada ao veículo: " + veiculo.novaPlaca("Ez8cf9si"));
        System.out.println("Acelerando: " + veiculo.acelar(15));
        System.out.println("Acelerando: " + veiculo.acelar(25));
        System.out.println("Acelerando: " + veiculo.acelar(35));
        System.out.println("Freando: " + veiculo.frear(10));
        System.out.println("Qual A placa do Veículo? " + veiculo.getPlaca());
        veiculo.novaPlaca("BatataDoce");
        System.out.println("Qual A placa do Veículo? " + veiculo.getPlaca());
    }
}
