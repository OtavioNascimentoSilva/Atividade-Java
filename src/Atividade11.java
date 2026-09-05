import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int itens;

        System.out.print("Qual o total de itens no estoque? ");
        itens = entrada.nextInt();

        if (itens <= 10) {
            System.out.println("Reposicao necessaria.");
        } else {
            System.out.println("Estoque dentro do padrao.");
        }

        entrada.close();
    }
}