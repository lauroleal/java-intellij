package br.com.dio;

import br.com.dio.model.Gato;

public class ProjetoDio {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);


        Livro livro1 = new Livro("Go Dev" ,200);
        System.out.println(livro1);

       /* int a = 3, b = 2;

        System.out.println("hello Word!" + (a+b));*/
    }
} class Livro{
    private String nome;
    private Integer qtPaginas;

    public Livro() {
    }

    public Livro(String nome, Integer qtPaginas) {
        this.nome = nome;
        this.qtPaginas = qtPaginas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", qtPaginas=" + qtPaginas +
                '}';
    }

    public void setQtPaginas(Integer qtPaginas) {
        this.qtPaginas = qtPaginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQtPaginas() {
        return qtPaginas;
    }
}
