package br.com.senai.model;

public class Livro {

    private String titulo;
    private String autor;
    private String editora;
    private int ano;

    public Livro(String titulo, String autor, String editora, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getAno() {
        return ano;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void imprimir(){
        System.out.println("\nTítulo do livro: "+ titulo +
                "\nAutor do livro: " + autor +
                "\nEditora do livro: " + editora +
                "\nAno de lançamento do livro: " + ano);
    }
}
