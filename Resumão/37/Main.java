// 37) Acrescentar uma mensagem de 'VALOR INVÁLIDO ' no exercício [35] caso o segundo valor
// informado seja ZERO.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valor1, valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scan.nextDouble();

        do {
            System.out.print("Digite o segundo valor (diferente de zero): ");
            valor2 = scan.nextDouble();
            if (valor2 == 0) {
                System.out.println("VALOR INVÁLIDO! Tente novamente.");
            }
        } while (valor2 == 0);

        double resultado = valor1 / valor2;

        System.out.println("O resultado da divisão é: " + resultado);
    }
}
