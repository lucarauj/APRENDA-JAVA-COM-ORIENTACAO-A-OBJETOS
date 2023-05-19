import java.util.Locale;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Locale.setDefault((Locale.US));
        Scanner sc = new Scanner(System.in);

        double media = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Qual a sua avaliação: ");
            nota = sc.nextDouble();
            media += nota;
        }

        System.out.println("A média de avaliação para esse filme é de: " + media/3);


    }
}
