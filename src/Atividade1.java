import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {

        double temperatura;

        Scanner entrada = new
                Scanner(System.in);

        System.out.print("Qual a temperatura do ambiente? ");
        temperatura = entrada.nextDouble();

        if (temperatura >= 28) {
           System.out.print(" Ligar Ar Condicionado, pois a temperatura esta desagradavel. ");
        }
            else
        {
            System.out.println("Temperatura agradavel, nao e necessario ligar o ar");
        }
            entrada.close();
    }
}
