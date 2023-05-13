// 55) Escreva um algoritmo para ler 10 números. Todos os números lidos com valor inferior a 40
// devem ser somados. Escreva o valor final da soma efetuada.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numero = scan.nextInt();

            if (numero < 40) {
                soma += numero;
            }
        }

        System.out.println("Soma dos números menores que 40: " + soma);

        scan.close();
    }
}
