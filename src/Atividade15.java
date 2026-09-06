import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();

        if (idade >= 16) {
            System.out.println("Matrícula permitida.");
        } else {
            System.out.println("Matrícula não permitida.");
        }

        entrada.close();
    }
}