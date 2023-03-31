// 11) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
// compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
// escreva o custo total da compra.

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.printf("Insira um numero de maças\n");
		
        int numero = scan.nextInt();
        
        if(numero >= 12){
            System.out.printf("o valor é %.2f\n",numero*1.00F);
        } else {
            System.out.printf("o valor é %.2f\n",numero*1.30F);
        }
    }
}