// 7) Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
// correspondente em graus Celsius (baseado na fórmula abaixo);

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
        
        System.out.printf("Insira o valor em celsius\n");
		float celsius = scan.nextFloat();


        float fahr = celsius*1.8F +32;
        
        System.out.printf("Temperatura fahrenheit: %.2f\n",fahr);
    }
}