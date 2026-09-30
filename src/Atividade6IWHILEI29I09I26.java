import java.util.Scanner;
public class Atividade6IWHILEI29I09I26 {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            String resposta;

            do {
                System.out.println("Pedido registrado.");

                System.out.print("Deseja registrar outro pedido? (S/N): ");
                resposta = entrada.next();

            } while (resposta.equalsIgnoreCase("S"));

            System.out.println("Programa encerrado.");
        }
    }

