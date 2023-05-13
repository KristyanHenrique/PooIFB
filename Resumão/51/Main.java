// 51) Ler 10 valores e escrever quantos desses valores lidos estão no intervalo [10,20] (incluindo os
// valores 10 e 20 no intervalo) e quantos deles estão fora deste intervalo.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, dentro = 0, fora = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();

            if (num >= 10 && num <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }

        System.out.println("Números dentro do intervalo [10,20]: " + dentro);
        System.out.println("Números fora do intervalo [10,20]: " + fora);
    }
}
