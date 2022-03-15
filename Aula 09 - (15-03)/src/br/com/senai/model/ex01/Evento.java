package br.com.senai.model.ex01;

import java.util.ArrayList;

public class Evento {

    private String nome;
    private String data;
    private String local;
    ArrayList<Cliente> clientes = new ArrayList<>();

    public Evento(String nome, String local, String data) {
        this.nome = nome;
        this.data = data;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void adicionarCliente(String nome, String cpf, String telefone, String email) {
        Cliente cliente = new Cliente(nome, cpf, telefone, email);
        clientes.add(cliente);
    }

    public void imprimir(){
        System.out.println("Evento: " + nome + "\nDia: " + data + "\nLocal: " +  local );
        if (clientes.size() != 0){
            System.out.println("\nLista de Clientes: ");
            clientes.forEach(e -> System.out.print("\n" + e));
        }
    }
}
