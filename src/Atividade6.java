import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valor, finalValor;

        System.out.print("Ola, qual foi valor total de sua compra? ");
        valor = entrada.nextDouble();

        if (valor >= 200) {
            finalValor = valor - (valor * 0.10);

            System.out.println("O valor ficara em: " + finalValor + " reais.");
        } else {
            System.out.println("O valor ficara em: " + valor + " reais.");
        }

        entrada.close();
    }
}