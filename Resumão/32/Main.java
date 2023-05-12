// 32) Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço
// unitário. Calcular e escrever o total (total = quantidade adquirida *preço unitário), o desconto e o total
// a pagar (total a pagar = total - desconto), sabendo-se que:
// - Se quantidade <= 5 o desconto será de 2%
// - Se quantidade > 5 e quantidade <=10 o desconto será de 3%
// - Se quantidade > 10 o desconto será de 5%

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.printf("insira o nome do produto\n");
		String t1 = sc.nextString();
        System.out.printf("Insira a qtd\n");
		int qtd = sc.nextInt();
        
        if(t1==){
            g1= g1*2.9;
        }else{
            g1= g1*3.3;
        }
        System.out.printf("%.2f é o valor\n",g1);
        
	}
}