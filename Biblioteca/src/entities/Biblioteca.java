package entities;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nome = "BIBLIOTECA";


    private List<Livro> livros = new ArrayList<>();

    public Biblioteca(String nome) {
        this.nome = nome;
    }
    public Biblioteca() {

    }

    public List<Livro> getLivros() {
        return livros;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addLivro(Livro livro) {
        livros.add(livro);
    }
    public void removeLivro(Livro livro) {
        livros.remove(livro);
    }


    public String imprimirLivro(String titulo) {
        for (Livro i : livros) {
            if (titulo == i.getTitulo())
                return i.getTitulo();
        }
        return null;
    }

    public Livro buscarLivro(String titulo) {
        for (Livro i : livros) {
            if (titulo == i.getTitulo())
                return i;
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + nome + "\n");
        sb.append("Livros:\n");
        for (Livro c : livros) {
            sb.append(c + "\n");
        }
        return sb.toString();
    }
}
