import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int senha;

        System.out.print("Digite a senha de acesso, para acessar: ");
        senha = entrada.nextInt();

        if (senha == 1234) {
            System.out.println("Acesso permitido, boa utilizacao.");
        } else {
            System.out.println("Acesso negado, senha incorreta ou invalida.");
        }

        entrada.close();
    }
}