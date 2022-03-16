package br.com.senai.model.ex02;

public class PessoaFisica extends Pessoa{

    private String cpf;
    private String rg;

    public PessoaFisica(String nome, String cpf, String rg) {
        super(nome);
        this.cpf = cpf;
        this.rg = rg;
    }

    // GETTERS AND SETTERS
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        if (super.getEndereco() != null){
            return( "\n" + super.getNome() + "\nCPF: " + cpf +
                    "\nRG: " + rg +
                    "\nEndereço: " + super.getEndereco()
            );
        }
        else{
            return ( "\n" + super.getNome() + "\nCPF: " + cpf +
                    "\nRG: " + rg
            );
        }
    }
}
