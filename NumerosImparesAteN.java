import java.util.Scanner;

public class NumerosImparesAteN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int n = scanner.nextInt();

        System.out.println("Números ímpares até " + n + ":");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}