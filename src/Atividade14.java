import java.util.Scanner;

public class Atividade14 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        double reais, dolar;

        System.out.print("Qual o valor em reais? ");
        reais = entrada.nextInt();

        dolar = reais * 5.4;

        System.out.println("O valor em dolar, que podera comprar e de: " + dolar);

        entrada.close();

    }
}
