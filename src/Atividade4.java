import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double distancia, consumo, preco, litros, custo;

        System.out.print("Qual foi a distancia percorrida, em km? ");
        distancia = entrada.nextDouble();

        System.out.print("Qual foi o consumo do carro? ");
        consumo = entrada.nextDouble();

        System.out.print("Preco do combustivel? ");
        preco = entrada.nextDouble();

        litros = distancia / consumo;
        custo = litros * preco;

        System.out.println("O total de litros gastos foi de: " + litros
                + ", e o custo foi de: " + custo + " reais.");

        entrada.close();
    }
}