// 25) Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam
// ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma
// dos outros 2 lados.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o valor de A: ");
    double a = scan.nextDouble();

    System.out.print("Digite o valor de B: ");
    double b = scan.nextDouble();

    System.out.print("Digite o valor de C: ");
    double c = scan.nextDouble();

    if (a < b + c && b < a + c && c < a + b) {
      System.out.println("Forma um triângulo");
    } else {
      System.out.println("Não forma um triângulo");
    }
  }
}
