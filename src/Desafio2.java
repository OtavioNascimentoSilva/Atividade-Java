import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        int horas;
        double valorHora, total;

        valorHora = 8.00;

        System.out.print("Digite o nome do cliente: ");
        nome = entrada.nextLine();

        System.out.print("Digite as horas utilizadas: ");
        horas = entrada.nextInt();

        total = horas * valorHora;

        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Horas utilizadas: " + horas);
        System.out.println("Valor por hora: " + valorHora + " reais");
        System.out.println("Total: " + total + " reais");

        if (total > 50) {
            System.out.println("Cliente Premium");
        } else {
            System.out.println("Cliente Comum");
        }

        entrada.close();
    }
}
