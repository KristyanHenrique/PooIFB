// 40) Acrescente uma mensagem 'NOVO CÁLCULO (S/N)? ' ao final do exercício [39]. Se for
// respondido 'S' deve retornar e executar um novo cálculo, caso contrário deverá encerrar o algoritmo

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean continuar = true;
        
        while (continuar) {
            System.out.print("Digite a primeira nota: ");
            double nota1 = scan.nextDouble();
            
            while (nota1 < 0 || nota1 > 10) {
                System.out.println("Valor inválido. Digite uma nota entre 0 e 10.");
                System.out.print("Digite a primeira nota: ");
                nota1 = scan.nextDouble();
            }
            
            System.out.print("Digite a segunda nota: ");
            double nota2 = scan.nextDouble();
            
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("Valor inválido. Digite uma nota entre 0 e 10.");
                System.out.print("Digite a segunda nota: ");
                nota2 = scan.nextDouble();
            }
            
            double media = (nota1 + nota2) / 2;
            
            System.out.printf("A média simples das notas %.1f e %.1f é %.1f.\n", nota1, nota2, media);
            
            System.out.print("NOVO CÁLCULO (S/N)? ");
            String resposta = scan.next();
            
            if (!resposta.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }
    }
}
