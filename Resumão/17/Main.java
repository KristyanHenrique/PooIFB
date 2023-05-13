// 17) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
// de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
// Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
// o salário total do funcionário, que deverá ser acrescido das horas extras, e caso tenham sido
// trabalhadas.
// (considere que o mês possua 4 semanas exatas).
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o número de horas trabalhadas no mês: ");
    int horasTrabalhadas = scan.nextInt();

    System.out.print("Digite o valor do salário por hora: R$ ");
    double valorHora = scan.nextDouble();

    double salarioNormal = valorHora * 40 * 4;
    double salarioTotal = salarioNormal;

    if (horasTrabalhadas > 40 * 4) {
      int horasExtras = horasTrabalhadas - 40 * 4;
      double valorHoraExtra = valorHora * 1.5;
      double salarioHoraExtra = valorHoraExtra * horasExtras;
      salarioTotal += salarioHoraExtra;
    }

    System.out.printf("Salário normal: R$ %.2f\n", salarioNormal);
    System.out.printf("Salário total: R$ %.2f\n", salarioTotal);

    scan.close();
  }
}
