// 36) Reescreva o exercício anterior utilizando a estrutura ENQUANTO.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valor1, valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scan.nextDouble();

        System.out.print("Digite o segundo valor (diferente de zero): ");
        valor2 = scan.nextDouble();

        while (valor2 == 0) {
            System.out.print("Valor inválido. Digite um valor diferente de zero: ");
            valor2 = scan.nextDouble();
        }

        double resultado = valor1 / valor2;

        System.out.println("O resultado da divisão é: " + resultado);

        scan.close();
    }
}
