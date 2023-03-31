// 5) O custo de um carro novo ao consumidor é a soma do custo de fábrica coma porcentagem do
// distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
// seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
// calcular e escrever o custo final ao consumidor

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.printf("Insira o preço base do veiculo\n");
		
        float base = scan.nextFloat();

        float precoFinal = (base*1.28F)*1.45F;
        
        System.out.printf("Preço final: %.2f\n",precoFinal);
    }
}