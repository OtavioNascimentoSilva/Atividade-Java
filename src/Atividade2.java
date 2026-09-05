import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        Scanner entrada = new
                Scanner(System.in);

        int quantidade;
        double valor, total;

        System.out.print("Qual foi a quantidade de produtos comprados? ");
        quantidade = entrada.nextInt();

        System.out.print("Qual foi o valor unitario dos produtos comprados? ");
        valor = entrada.nextDouble();

        total = quantidade * valor;

        if (total >= 100) {
            System.out.println("Voce recebeu frete gratis para sua compra. ");
        } else {
            System.out.println("Frete gratis indisponivel, para sua  compra. ");
        }
        System.out.println("O valor total de sua compra e: "  + total + " reais.");

        entrada.close();
    }
}
