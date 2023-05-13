// 29) Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades
// dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma
// das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais
// novo com a mulher mais velha
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int idade_homem1, idade_homem2, idade_mulher1, idade_mulher2;
        
        System.out.print("Digite a idade do primeiro homem: ");
        idade_homem1 = scan.nextInt();
        System.out.print("Digite a idade do segundo homem: ");
        idade_homem2 = scan.nextInt();
        System.out.print("Digite a idade da primeira mulher: ");
        idade_mulher1 = scan.nextInt();
        System.out.print("Digite a idade da segunda mulher: ");
        idade_mulher2 = scan.nextInt();
        
        int homem_mais_velho = Math.max(idade_homem1, idade_homem2);
        int homem_mais_novo = Math.min(idade_homem1, idade_homem2);
        int mulher_mais_velha = Math.max(idade_mulher1, idade_mulher2);
        int mulher_mais_nova = Math.min(idade_mulher1, idade_mulher2);
        
        int soma_idades = homem_mais_velho + mulher_mais_nova;
        int produto_idades = homem_mais_novo * mulher_mais_velha;
        
        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + soma_idades);
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + produto_idades);
    }
}
