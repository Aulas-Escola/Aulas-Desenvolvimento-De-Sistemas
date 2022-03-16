package br.com.senai.model.ex02;

public class PessoaJuridica extends Pessoa{

    private String cnpj;
    private String ie;

    public PessoaJuridica(String nome, String cnpj, String ie) {
        super(nome);
        this.cnpj = cnpj;
        this.ie = ie;
    }

    // GETTERS AND SETTERS
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getIe() {
        return ie;
    }
    public void setIe(String ie) {
        this.ie = ie;
    }

    @Override
    public String toString() {
        if (super.getEndereco() != null){
            return( "\n" + super.getNome() + "\nCNPJ: " + cnpj +
                    "\nIE: " + ie +
                    "\nEndereço: " + super.getEndereco()
            );
        }
        else{
            return( "\n" +  super.getNome() + "\nCNPJ: " + cnpj + "\nIE: " + ie );
        }

    }
}
