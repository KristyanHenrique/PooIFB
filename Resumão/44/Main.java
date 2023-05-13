45) Modifique o exercício anterior para aceitar somente valores maiores que 0 para N. Caso o valor
informado (para N) não seja maior que 0, deverá ser lido um novo valor para N.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Digite um valor inteiro maior que zero: ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
