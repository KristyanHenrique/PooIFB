// 47) Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor
// lido.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;
        do {
            System.out.print("Digite um valor entre 1 e 10: ");
            valor = sc.nextInt();
        } while (valor < 1 || valor > 10);

        System.out.println("Tabuada do " + valor + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = valor * i;
            System.out.println(valor + " x " + i + " = " + resultado);
        }
        
        sc.close();
    }
}
