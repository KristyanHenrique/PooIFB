// 2 Ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS e quantos são POSITIVOS. 

import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scan =  new Scanner(System.in);
		System.out.printf("Insira 10 Valores\n");
		
        ArrayList<Integer> listaInts = new ArrayList<Integer>();
        
        for (int i=0;i<10 ;i++ ) {
            listaInts.add(scan.nextInt());
        }
        int positivos = 0;
        int negativos = 0;
        for (int i=0; i<10 ;i++ ) {
            if (listaInts.get(i) > 0) {
                positivos++;
            }else{
                negativos++;
            }
        }
        System.out.printf("Numeros impares: %d \nNumeros pares: %d \n",negativos,positivos);

        
    }
}
