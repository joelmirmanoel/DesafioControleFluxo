import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro: ");
            int numero1 = scanner.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            int numero2 = scanner.nextInt();

            if (numero1 > numero2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            int quantidadeInteracoes = numero2 - numero1;

            for (int i = 1; i <= quantidadeInteracoes; i++) {
                System.out.println("Imprimindo o número " + i);
            }

        } catch (ParametrosInvalidosException e) {
            System.out.println("Error "+ e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}