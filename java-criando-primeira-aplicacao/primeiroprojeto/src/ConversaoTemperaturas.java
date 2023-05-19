import java.util.Scanner;

public class ConversaoTemperaturas {

    public static void main(String[] args) {

        double celsius;
        int fahrenheit;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Celsius: ");
        celsius = sc.nextDouble();

        //No exercício foi solicitado criar uma variável int fahrenheit, sendo necessário fazer o casting
        fahrenheit = (int) (celsius * 1.8) + 32;

        System.out.println("Sua temperatura em Fahrenheit é " + fahrenheit);

        sc.close();
    }
}
