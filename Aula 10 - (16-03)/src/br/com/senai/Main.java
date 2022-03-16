package br.com.senai;

import br.com.senai.model.ex01.Caminhao;
import br.com.senai.model.ex01.Carro;
import br.com.senai.model.ex02.PessoaFisica;
import br.com.senai.model.ex02.PessoaJuridica;
import br.com.senai.model.ex03.Cliente;
import br.com.senai.model.ex03.Funcionario;
import br.com.senai.model.ex04.Aluno;
import br.com.senai.model.ex04.Professor;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        /* EXERCÍCIO 01 */

        /*
        Carro ferrari = new Carro("Ferrari F8", 2);
        ferrari.definirMarca("Ferrari", "Carro Esporte");
        System.out.println(ferrari);

        Caminhao volvoFH540 = new Caminhao("Volvo FH 540", 9);
        volvoFH540.definirMarca("Volvo", "Potente");
        System.out.println(volvoFH540);
         */

        /* EXERCÍCIO 02 */
        /*
        PessoaFisica p1 = new PessoaFisica("Igor", "123.456.789-10", "4.234423");
        p1.definirEndereco("Estrada ABC", 10, "Ratão", "88052-100");
        System.out.println(p1);

        PessoaJuridica p2 = new PessoaJuridica("Igor", "1234/0001-123", "2345");
        p2.definirEndereco("Estrada DEF", 20, "RATINHO", "88052-120");
        System.out.println(p2);

        PessoaJuridica p3 = new PessoaJuridica("Igor", "1234/0001-123", "2345");
        System.out.println(p3);
        */

        /* EXERCÍCIO 03 */

        /*
        Funcionario igor = new Funcionario("Igor", "Medeiros Ribeiro", "igormr632@gmail.com", "48 99627-9325",
                "Programador", 12312);
        System.out.println(igor);

        // A data já está sendo pega automaticamente quando damos run no código
        Cliente brunao = new Cliente("Bruno", "Bandeira", "brunobodybuilder@gmail.com", "48 2345-6789");
        System.out.println(brunao);
        */

        /* EXERCÍCIO 04 */

        Aluno aluno = new Aluno("Igor", 10, 5);
        aluno.calcularMedia();
        System.out.println(aluno);

        Professor paulo = new Professor("Paulão", 40, 15);
        paulo.calcularSalario();
        System.out.println(paulo);
    }

}
