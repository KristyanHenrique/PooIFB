// 54) Escreva um algoritmo para ler 10 números e ao final da leitura escrever a soma total dos 10
// números lidos.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, soma = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            num = scan.nextInt();
            soma += num;
        }
        
        System.out.println("A soma dos números digitados é: " + soma);
    }
}
