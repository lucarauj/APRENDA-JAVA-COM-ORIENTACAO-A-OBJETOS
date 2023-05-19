public class Condicional {

    public static void main(String[] args) {

        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = (int) 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamentos curtidos!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Conteúdo liberado!");
        } else {
            System.out.println("Contrate um plano!");
        }
    }
}
