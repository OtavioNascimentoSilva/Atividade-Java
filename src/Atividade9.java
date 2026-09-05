import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double consumo, valor, total;

        System.out.print("Qual foi o consumo em Kw/h? ");
        consumo = entrada.nextDouble();

        System.out.print("Qual o valor do Kw/h? ");
        valor = entrada.nextDouble();

        total = consumo * valor;

        if (total >= 300) {
            System.out.println("Consumo elevado, deve reduzir o uso."
                    + " O valor total foi de " + total + " reais.");
        } else {
            System.out.println("Consumo dentro do padrao esperado."
                    + " O valor total foi de " + total + " reais.");
        }

        entrada.close();
    }
}