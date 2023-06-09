// 34) Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para
// estar em condições, um dos seguintes requisitos deve ser satisfeito:
// - Ter no mínimo 65 anos de idade.
// - Ter trabalhado no mínimo 30 anos.
// - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
// Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano
// de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo
// de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número do empregado: ");
        int codigo = scan.nextInt();

        System.out.print("Digite o ano de nascimento do empregado: ");
        int anoNascimento = scan.nextInt();

        System.out.print("Digite o ano de ingresso do empregado na empresa: ");
        int anoIngresso = scan.nextInt();

        int idade = 2023 - anoNascimento;
        int tempoTrabalho = 2023 - anoIngresso;

        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");
        }
    }
}
