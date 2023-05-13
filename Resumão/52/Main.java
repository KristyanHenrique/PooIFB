// 52) Ler 10 valores, calcular e escrever a média aritmética desses valores lidos.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma = 0;
        int qtdValores = 10;

        for (int i = 1; i <= qtdValores; i++) {
            System.out.printf("Digite o %dº valor: ", i);
            double valor = scan.nextDouble();
            soma += valor;
        }

        double media = soma / qtdValores;

        System.out.printf("A média dos valores lidos é: %.2f%n", media);

        scan.close();
    }
}
