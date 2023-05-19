import java.util.Locale;
import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {

        Locale.setDefault((Locale.US));
        Scanner sc = new Scanner(System.in);

        double media = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite uma avaliação ou -1 para 'Sair': ");
            nota = sc.nextDouble();
            if (nota != -1) {
                media += nota;
                totalDeNotas++;
            }
        }

        System.out.println("A média de avaliação para esse filme é de: " + media/totalDeNotas);

    }
}
