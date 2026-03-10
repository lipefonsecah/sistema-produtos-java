package academia;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        aluno aluno = new aluno();

        int opcao;

        do {

            System.out.println("\n=== SISTEMA DA ACADEMIA ===");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Mostrar aluno");
            System.out.println("3 - Sair");

            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                System.out.print("Nome: ");
                aluno.nome = scanner.nextLine();

                System.out.print("Idade: ");
                aluno.idade = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Plano (Musculação / Crossfit / Premium): ");
                aluno.plano = scanner.nextLine();

                System.out.println("Aluno cadastrado com sucesso!");

            }

            else if (opcao == 2) {

                System.out.println("\n--- Dados do Aluno ---");
                System.out.println("Nome: " + aluno.nome);
                System.out.println("Idade: " + aluno.idade);
                System.out.println("Plano: " + aluno.plano);

            }

        } while (opcao != 3);

        System.out.println("Sistema encerrado.");

        scanner.close();
    }

}
