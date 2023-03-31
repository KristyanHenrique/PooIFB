// 6) Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por
// mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
// efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
// vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
// vendedor.

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);

		System.out.printf("Insira o numero de carros vendidos\n");
		int nCarros = scan.nextInt();
        
        System.out.printf("Insira o valor vendido\n");
		float valorVendas = scan.nextFloat();

        System.out.printf("Insira o salario fixo\n");
		float valorSalario = scan.nextFloat();

        System.out.printf("Insira o valor recebido por carro\n");
		float valorPorCarro = scan.nextFloat();

        float salarioFinal = valorSalario+(valorVendas*1.05F)+(valorPorCarro*nCarros);
        
        System.out.printf("salario Final: %.2f\n",salarioFinal);
    }
}