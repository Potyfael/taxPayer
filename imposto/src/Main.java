import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many person will be registered? ");
        int n = sc.nextInt();

        List<Pessoa> pessoas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            System.out.print("Individual person or Legal person? [i/l] ");
            char option = sc.next().charAt(0);
            if (option == 'i') {
                System.out.print("Health spending: $");
                Double healthSpending = sc.nextDouble();
                Pessoa pessoa = new PessoaFisica(name, anualIncome, healthSpending);
                pessoas.add(pessoa);
            }
            if (option == 'l') {
                System.out.print("Number of employees: ");
                int numOfEmployees = sc.nextInt();
                Pessoa p = new PessoaJuridica(name, anualIncome, numOfEmployees);
                pessoas.add(p);
            }
        }
        sc.close();
        System.out.println();
        System.out.println("TAXES PAID:");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}
