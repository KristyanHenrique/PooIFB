// 4) Escreva um algoritmo que leia a idade de uma pessoa em anos e apresente uma mensagem
// identificando se é maior ou menor de 18 anos.

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.printf("Insira a Idade\n");
		
        int idade = scan.nextInt();
        
        if (idade == 18){
            System.out.printf("A idade é 18");
        } else if(idade > 18){
            System.out.printf("A idade é maior que 18");
        } else {
            System.out.printf("A idade é menor que 18");
        }
    }
}