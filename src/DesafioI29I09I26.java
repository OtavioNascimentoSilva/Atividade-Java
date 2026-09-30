import java.util.Scanner;
public class DesafioI29I09I26 {
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            double venda;
            double total = 0;
            double media;
            int quantidade = 0;

            System.out.print("Digite o valor da venda (0 para encerrar): ");
            venda = entrada.nextDouble();

            while (venda != 0) {

                total = total + venda;
                quantidade = quantidade + 1;

                System.out.print("Digite o valor da venda (0 para encerrar): ");
                venda = entrada.nextDouble();
            }

            System.out.println("Total arrecadado: R$ " + total);
            System.out.println("Quantidade de vendas: " + quantidade);

            if (quantidade > 0) {
                media = total / quantidade;
                System.out.println("Média das vendas: R$ " + media);
            } else {
                System.out.println("Nenhuma venda foi realizada.");
            }
        }
    }

