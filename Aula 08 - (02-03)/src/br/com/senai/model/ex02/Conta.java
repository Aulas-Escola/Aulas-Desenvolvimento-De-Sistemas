package br.com.senai.model.ex02;

public class Conta {

    private double saldo;
    private double limite;
    private int numero;


    public Conta(double saldo, double limite, int numero){
        this.saldo = saldo;
        this.limite = limite;
        this.numero = numero;
    }

    public void sacar(double valor){
        if (saldo > valor){
             saldo -= valor;
        }
        else{
            saldo = saldo;
        }
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void alterarLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "\nSaldo: " + saldo +
                ", \nLimite: " + limite +
                ", \nNumero da conta: " + numero;
    }
}
