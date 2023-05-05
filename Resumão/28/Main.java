// 28) Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado
// da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente
// sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.printf("insira o codigo do produto\n");
		char t1 = sc.next();
        System.out.printf("Insira o valor\n");
		float g1 = sc.nextFloat();
        
        if(t1=='A'){
            g1= g1*2.9;
        }else{
            g1= g1*3.3;
        }
        System.out.printf("%.2f é o valor\n",g1);
        
	}
}