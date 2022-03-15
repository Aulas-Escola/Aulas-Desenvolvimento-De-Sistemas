package br.com.senai.model.ex04;

import java.text.DecimalFormat;

public class PessoaIMC {

    private double peso;
    private double altura;
    private double IMC;


    public PessoaIMC(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
        this.IMC = peso / (altura * altura);
    }

    public void imprimir(){
        if(IMC > 0 && IMC < 18.5){
            System.out.println(IMC + " Abaixo do Peso");
        }
        else if(IMC >= 18.5 && IMC < 25){
            System.out.println(IMC + " Peso Normal");
        }
        else if(IMC >= 25 && IMC < 30){
            System.out.println(IMC + " Acima do peso");
        }
        else if (IMC > 30){
            System.out.println(IMC + " Obeso");
        }
        else{
            System.out.println("Valor Inválido");
        }
    }
}
