package aula07.desafio;

import java.util.Scanner;

public class Desafio2_T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = """
                ___________________________________
                |  Escolha uma opção:             |
                |   1 - Exibir Cadastro Completo  |
                |   2 - Cadastra Usuário          |
                |   3 - Atualizar Usuário         |
                |   4 - Deletar Usuário           |
                |   5 - Sair                      |
                |_________________________________|
                """;
        int opcao;
        do {
            System.out.println(menu);
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    exibirUsuarios();
                    break;
                case 2:
                    cadastrarUsuarios();
                    break;
                case 3:
                    atualizarUsuarios();
                    break;
                case 4:
                    deletarUsuarios();
                    break;
                case 5:
                    System.out.println("Programa Encerrado");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }while (opcao!=5);
    }
    public static void exibirUsuarios(){
        System.out.println("exibirUsuarios");
    }

    public static void cadastrarUsuarios(){
        System.out.println("cadastrarUsuarios");
    }

    public static void atualizarUsuarios(){
        System.out.println("atualizarUsuarios");
    }

    public static void deletarUsuarios(){
        System.out.println("deletarUsuarios");
    }
}
