// 32) Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço
// unitário. Calcular e escrever o total (total = quantidade adquirida *preço unitário), o desconto e o total
// a pagar (total a pagar = total - desconto), sabendo-se que:
// - Se quantidade <= 5 o desconto será de 2%
// - Se quantidade > 5 e quantidade <=10 o desconto será de 3%
// - Se quantidade > 10 o desconto será de 5%

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a descrição do produto: ");
        String nome = input.nextLine();

        System.out.print("Digite a quantidade adquirida: ");
        int quantidade = input.nextInt();

        System.out.print("Digite o preço unitário: ");
        double precoUnitario = input.nextDouble();

        double total = quantidade * precoUnitario;

        double desconto = 0.0;
        if (quantidade <= 5) {
            desconto = total * 0.02;
        } else if (quantidade <= 10) {
            desconto = total * 0.03;
        } else {
            desconto = total * 0.05;
        }

        double totalAPagar = total - desconto;

        System.out.printf("Total: R$ %.2f%n", total);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Total a pagar: R$ %.2f%n", totalAPagar);

        input.close();
    }
}