// 39) Escreva um algoritmo para ler as notas da 1
// a e 2
// a avaliações de um aluno, calcule e imprima a
// média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada
// nota.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota1, nota2;

        do {
            System.out.print("Digite a primeira nota (0 a 10): ");
            nota1 = scan.nextDouble();
        } while (nota1 < 0 || nota1 > 10);

        do {
            System.out.print("Digite a segunda nota (0 a 10): ");
            nota2 = scan.nextDouble();
        } while (nota2 < 0 || nota2 > 10);

        double media = (nota1 + nota2) / 2;

        System.out.println("A média do aluno é: " + media);

        scan.close();
    }
}
