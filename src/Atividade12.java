import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double velocidade;

        System.out.print("Qual a velocidade da sua internet em Mbps? ");
        velocidade = entrada.nextDouble();

        if (velocidade >= 100) {
            System.out.println("Velocidade adequada para o seu uso.");
        } else {
            System.out.println("Velocidade inadequada para o seu uso.");
        }

        entrada.close();
    }
}