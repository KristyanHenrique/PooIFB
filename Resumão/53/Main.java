// 53) Ler o número de alunos existentes em uma turma e, após isto, ler as notas destes alunos,
// calcular e escrever a média aritmética dessas notas lidas.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe o número de alunos: ");
        int numAlunos = scan.nextInt();
        
        double somaNotas = 0.0;
        for (int i = 1; i <= numAlunos; i++) {
            System.out.print("Informe a nota do aluno " + i + ": ");
            double nota = scan.nextDouble();
            somaNotas += nota;
        }
        double media = somaNotas / numAlunos;
        System.out.println("Média das notas: " + media);
    }
}
