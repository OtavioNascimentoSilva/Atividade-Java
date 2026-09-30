import java.util.Scanner;
public class Atividade5IWHILEI29I09I26 {
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            int opcao;
            double saldo = 0;
            double deposito;

            do {
                System.out.println("\n1 - Ver saldo");
                System.out.println("2 - Fazer depósito");
                System.out.println("3 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = entrada.nextInt();

                if (opcao == 1) {
                    System.out.println("Saldo: R$ " + saldo);
                }

                else if (opcao == 2) {
                    System.out.print("Digite o valor do depósito: ");
                    deposito = entrada.nextDouble();

                    saldo = saldo + deposito;

                    System.out.println("Depósito realizado.");
                }

            } while (opcao != 3);

            System.out.println("Programa encerrado.");
        }
    }

