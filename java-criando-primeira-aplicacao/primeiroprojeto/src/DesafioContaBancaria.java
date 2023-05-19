import java.util.Scanner;

public class DesafioContaBancaria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = "Lucas Araujo";
        String conta = "Corrente";
        double saldo = 2500;

        System.out.println("****************************************\n");
        System.out.println("Dados iniciais do cliente: \n");
        System.out.println("Nome:              " + nome);
        System.out.println("Tipo conta:        " + conta);
        System.out.println("Saldo inicial:     " + String.format("%.2f", saldo));
        System.out.println("\n****************************************\n");

        String operacao = """
                Operações:
                    
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:""";

        int opcao = 0;

        while (opcao != 4) {
            System.out.println(operacao);
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é: " + String.format("%.2f%n", saldo));
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber:");
                double recebido = sc.nextDouble();
                if (recebido > 0) {
                    saldo += recebido;
                    System.out.println("Saldo atualizado: " + String.format("%.2f%n", saldo));
                }
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                double transfere = sc.nextDouble();
                if (transfere <= 0 || transfere > saldo) {
                    System.out.println("Não há saldo suficiente para fazer essa transferência.\n");
                } else {
                    saldo -= transfere;
                    System.out.println("Saldo atualizado: " + String.format("%.2f%n", saldo));
                }
            } else if (opcao != 4) {
                    System.out.println("Opção inválida!\n");
            }
        }
        sc.close();
    }
}
