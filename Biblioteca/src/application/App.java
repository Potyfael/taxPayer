package application;


import entities.Biblioteca;
import entities.Livro;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int item;
        int[] opcoes =  {1,2,3,4};



        System.out.print("Nome da biblioteca? ");
        String bibliotecaNome = sc.nextLine();
        Biblioteca biblioteca = new Biblioteca(bibliotecaNome);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        while (true) {
            System.out.printf("Bem-vindo à Biblioteca %s!\n", biblioteca.getNome());
            System.out.print("[1] ADICIONAR LIVRO\n[2] REMOVER LIVROS\n");
            System.out.print("[3] BUSCAR LIVRO\n[4] SAIR DO PROGRAMA\n");

            // verifica se a respota do usuario esta num intervalo de 1 a 4
            do {
                System.out.print("DIGITE AQUI: ");
                item = sc.nextInt();
                if (verificarVetor(opcoes, item))
                    break;
            } while (false);
            if (item == 4)
                break;
            switch (item) {
                case 1:
                    System.out.println("=====ADICIONAR LIVRO=====");
                    System.out.print("Titulo do livro: ");
                    sc.nextLine();
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String livroAutor = sc.nextLine();
                    System.out.print("Ano de nascimento do autor: ");
                    int nascimentoAutor = sc.nextInt();
                    Livro livro = new Livro(titulo, livroAutor, nascimentoAutor);
                    biblioteca.addLivro(livro);
                    break;

                case 2:
                    System.out.println("=====REMOVER LIVRO=====");
                    System.out.print("Digite o titulo do livro: ");
                    sc.nextLine();
                    titulo = sc.nextLine();
                    if (biblioteca.buscarLivro(titulo) != null)
                        biblioteca.removeLivro(biblioteca.buscarLivro(titulo));
                    else
                        System.out.println("Livro nao existe na biblioteca!");
                    break;

                case 3:
                    System.out.println("=====BUSCAR LIVRO=====");
                    System.out.print("Digite o titulo do livro: ");
                    sc.nextLine();
                    titulo = sc.nextLine();
                    if (biblioteca.imprimirLivro(titulo) != null)
                        biblioteca.imprimirLivro(titulo);
                    else
                        System.out.println("Livro nao existe na biblioteca!");
                    break;
                default:
                    System.out.println("=====SAIR DO PROGRAMA=====");
                    System.out.println("Finalizando programa....");
                    break;
            }
        }
        System.out.println("\nPROGRAMA FINALIZADO!");
        sc.close();
    }

    public static boolean verificarVetor(int[] opcoes, int item) {
        for (int i : opcoes) {
            if (i == item)
                return true;
        }
        return false;
    }
}
