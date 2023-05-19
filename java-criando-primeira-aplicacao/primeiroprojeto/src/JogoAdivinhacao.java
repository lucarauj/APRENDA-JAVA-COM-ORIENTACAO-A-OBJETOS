import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numAleatorio = new Random().nextInt(100);

        System.out.println("Chute um número entre 0 e 100:");

        for (int i = 0; i < 5; i++) {

            int numChute = sc.nextInt();

            switch (Integer.compare(numChute, numAleatorio)) {
                case (-1):
                    System.out.println("Seu chute é menor do que o número aleatório.");
                    break;
                case 0:
                    System.out.println("Parabéns! Você acertou o número aleatório!");
                    i = 3;
                    break;
                case 1:
                    System.out.println("Seu chute é maior do que o número aleatório.");
                    break;
                default:
                    System.out.println("Entrada inválida.");
                    break;
            }
        }
        sc.close();
    }
}
