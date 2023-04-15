// 82) Faça um algoritmo para ler 50 números e armazenar em um vetor VET, verificar e escrever
// se existem números repetidos no vetor VET e em que posições se encontram.

import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Random gerador = new Random();
        int vet[] = new int[50];
        int posicoes[] = new int[50];
        int count = 0;

        for (int i = 0; i<50 ; i++){
            vet[i] = gerador.nextInt(100);
        }

        for (int i = 0; i<50 ; i++){
            System.out.printf("%d | %d\n",i,vet[i]);
        }

        for (int i = 0; i < 50; i++) {
            for (int j = i + 1; j < 50; j++) {
                if (vet[i] == vet[j]) {
                    posicoes[count] = i;
                    posicoes[count + 1] = j;
                    count += 2;
                } 
            }
        }

        if (count > 0) {
            System.out.print("Os números repetidos estão nas posições: ");
            for (int i = 0; i < count; i++) {
                System.out.print(posicoes[i] + " ");
            }
            System.out.printf(" \n");
        } else {
            System.out.print("Não há números repetidos.");
        }
    }
}