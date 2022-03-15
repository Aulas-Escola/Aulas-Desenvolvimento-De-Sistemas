package br.com.senai;

import br.com.senai.model.Endereco;
import br.com.senai.model.Livro;
import br.com.senai.model.Pessoa;

public class Main {

    public static void main(String[] args) {
        Livro l1 = new Livro("aadfas"," dafadsf", " aafdf", 1932);
        l1.setAno(2020);
        System.out.println(l1.getAno());
        l1.imprimir();

        Endereco minhaCasa = new Endereco("Servidão das bromélias", "Saco Grande", "Florianópolis", 108);
        System.out.println("\n" + minhaCasa);
        minhaCasa.setRua("ABC");
        System.out.println(minhaCasa.getRua());

        Pessoa igor = new Pessoa("Igor", "15/06/2005");
        System.out.println(igor);
        igor.setNome("Julia");
        igor.setDataDeNascimento("15/07/2004");
        System.out.println(igor);
        System.out.println(igor.getDataDeNascimento());
    }
}
