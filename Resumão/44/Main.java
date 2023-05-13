// 44) Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere
// que o N será sempre maior que ZERO.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor inteiro N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

    }
}

