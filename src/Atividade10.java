import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario;
        String nome;

        System.out.print("Qual o seu nome? ");
        nome = entrada.nextLine();

        System.out.print("Qual a sua faixa salarial? ");
        salario = entrada.nextDouble();

        if (salario >= 3000) {
            System.out.println("Faixa salarial alta.");
        } else {
            System.out.println("Faixa salarial basica.");
        }

        entrada.close();
    }
}