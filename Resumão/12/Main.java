// 12) Ler as notas da 1a e 2a avaliações de um aluno. Calcular a média aritmética simples e escrever uma
// mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno
// é aprovado). Escrever também a media calculada

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.printf("Insira 2 notas\n");
		
        ArrayList<Float> listaNotas = new ArrayList<Float>();
        
        for (int i=0;i<2 ;i++ ) {
            listaNotas.add(scan.nextFloat());
        }
        float media = (listaNotas.get(0)+listaNotas.get(1))/2;

        if(media>=6){
            System.out.printf("Aprovado com: %.2f",media);
        }else{
            System.out.printf("Reprovado com: %.2f",media);
        }
        
        
	}
}

