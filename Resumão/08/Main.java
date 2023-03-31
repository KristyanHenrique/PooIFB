// 8) Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
// Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da
// média final é:
// n1 * 2 + n2 * 3 + n3 *
// 5
// mediafinal =
// ---------------------------------

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.printf("Insira as 3 notas Valores\n");
		
        ArrayList<Float> listaNotas = new ArrayList<Float>();
        
        for (int i=0;i<3 ;i++ ) {
            listaNotas.add(scan.nextFloat());
        }
        Float notas = null;

        notas = ((listaNotas.get(0) * 2)+(listaNotas.get(1) * 3)+(listaNotas.get(2) * 5))/10;
        System.out.printf("O media é: %.2f \n",notas);
        
	}
}
