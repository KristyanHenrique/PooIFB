// 50) Ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int negativos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº valor: ", i);
            int valor = sc.nextInt();
            
            if (valor < 0) {
                negativos++;
            }
        }
        
        System.out.printf("Foram digitados %d valores negativos.%n", negativos);
        
        sc.close();
    }
}
