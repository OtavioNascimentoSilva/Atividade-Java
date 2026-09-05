import java.util.Scanner;

    public class Atividade3 {
        public static void main(String[] args) {

            int idade;
            String nome;

            Scanner entrada = new Scanner(System.in);

            System.out.println("Qual seu nome?");
            nome = entrada.nextLine();

            System.out.println("Qual a sua idade?");
            idade = entrada.nextInt();

            if (idade >= 18) {
                System.out.println("Voce " + nome + " esta autorizado(a) a participar da excursao.");
            } else {
                System.out.println("Voce " + nome + " precisa da autorizacao de responsavel.");
            }

            entrada.close();
        }
    }

