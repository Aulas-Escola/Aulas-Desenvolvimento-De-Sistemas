package br.com.senai.model.ex03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente extends Pessoa{

    private String dataCadastro;
    private Date dataHoraAtual = new Date();

    public Cliente(String nome, String sobrenome, String email, String telefone) {
        super(nome, sobrenome, email, telefone);
        this.dataCadastro = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
    }

    // GETTERS AND SETTERS
    public String getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "\nData de Cadastro: " + dataCadastro;
    }
}
