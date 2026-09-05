import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int velocidade;

        System.out.print("Informe a velocidade do veiculo: ");
        velocidade = entrada.nextInt();

        if (velocidade <= 60) {
            System.out.println("Dentro do limite da via.");
        } else {
            System.out.println("Fora do limite da via, deve receber uma infracao de transito.");
        }

        entrada.close();
    }
}