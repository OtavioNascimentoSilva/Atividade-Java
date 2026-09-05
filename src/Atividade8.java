import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.print("Qual foi a sua primeira nota? ");
        nota1 = entrada.nextDouble();

        System.out.print("Qual foi a sua segunda nota? ");
        nota2 = entrada.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 60) {
            System.out.println("Aprovado, a sua media foi de: " + media);
        } else {
            System.out.println("Reprovado, a sua media foi de: " + media);
        }

        entrada.close();
    }
}