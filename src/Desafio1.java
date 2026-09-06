import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        int quantidade;
        double valorUnitario, total, desconto, valorFinal;

        System.out.print("Digite o nome do cliente: ");
        nome = entrada.nextLine();

        System.out.print("Digite a quantidade de hambúrgueres: ");
        quantidade = entrada.nextInt();

        System.out.print("Digite o valor unitário do hambúrguer: ");
        valorUnitario = entrada.nextDouble();

        total = quantidade * valorUnitario;

        if (total >= 50) {
            desconto = total * 0.05;
        } else {
            desconto = 0;
        }

        valorFinal = total - desconto;

        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Valor da compra: " + total + " reais");
        System.out.println("Valor do desconto: " + desconto + " reais");
        System.out.println("Valor final: " + valorFinal + " reais");

        entrada.close();
    }
}