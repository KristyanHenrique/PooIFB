// 27) Ler dois valores e imprimir uma das três mensagens a seguir:
// ● ‘Números iguais’, caso os números sejam iguais.
// ● ‘Primeiro é maior’, caso o primeiro seja maior que o segundo; ‘Segundo maior’, caso o
// segundo seja maior que o primeiro.

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
        System.out.printf("insira 2 numeros\n");
		int g1 = sc.nextInt();
        int g2 = sc.nextInt();

        if(g1==g2){
            System.out.printf("Numeros iguais\n");
        }if(g1>g2){
            System.out.printf("Primeiro Maior");
        }else{
            System.out.printf("Segundo Maior");
        }
	}
}