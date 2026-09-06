import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double frequencia;
        int aulas, faltas;

        System.out.print("Qual foi a quantidade total de aulas? ");
        aulas = entrada.nextInt();

        System.out.print("Quantas faltas você possui? ");
        faltas = entrada.nextInt();

        frequencia = ((aulas - faltas) * 100.0) / aulas;

        if (frequencia >= 75) {
            System.out.println("Parabens, voce teve o total de presenca adequado " + frequencia);
        } else {
            System.out.println("Infelizmente, voce nao obteve o total de presenca minima " + frequencia);
        }

        entrada.close();
    }
}