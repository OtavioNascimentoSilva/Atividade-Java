import java.util.Scanner;
public class Atividade4IWHILEI29I09I2026 {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            int senha = 0;

            while (senha != 2025) {
                System.out.print("Digite a senha: ");
                senha = entrada.nextInt();

                if (senha != 2025) {
                    System.out.println("Senha inválida.");
                }
            }

            System.out.println("Acesso liberado.");
        }
    }

