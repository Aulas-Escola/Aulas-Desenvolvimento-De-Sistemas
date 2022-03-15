package br.com.senai.model;

public class Conta {

    private String numeroAgencia;
    private String numeroConta;
    private int saldo;
    private String valor;

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public int getSaldo(){
        return saldo;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double depositar(double value){
        if (value < 0){
            value = 0;
            return saldo;
        } else{
            return this.saldo += value;
        }
    }

    public double sacar(double value){
        if (value > saldo){
            return saldo;
        }
        else{
            return this.saldo -= value;
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroAgencia='" + numeroAgencia + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
