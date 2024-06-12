package entities;

public class Livro {

    private String titulo;
    private String autor;
    private Integer anoDePublicao;

    public Livro(String titulo, String autor, Integer anoDePublicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicao = anoDePublicao;
    }
    public Livro() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoDePublicao() {
        return anoDePublicao;
    }

    public String toString() {
        String livro = String.format("%s, %s, %d",titulo, autor, anoDePublicao);
        return livro;
    }
}
