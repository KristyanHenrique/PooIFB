// 82) Faça um algoritmo para ler 50 números e armazenar em um vetor VET, verificar e escrever
// se existem números repetidos no vetor VET e em que posições se encontram.

import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Random gerador = new Random();
        int v1[] = new int[50];
        

        for (int i = 0; i<50 ; i++){
            v1[i] = gerador.nextInt(100);
        }

        for (int i = 0; i<50 ; i++){
            System.out.printf("%d | %d\n",i,v1[i]);
        }

        for

    }
}