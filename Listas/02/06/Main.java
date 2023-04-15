// 6) Ler 10 números e imprimir quantos são pares e quantos são ímpares.

import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scan =  new Scanner(System.in);
		System.out.printf("Insira 10 Valores\n");
		
        ArrayList<Integer> listaInts = new ArrayList<Integer>();
        
        for (int i=0;i<10 ;i++ ) {
            listaInts.add(scan.nextInt());
        }
        int par = 0;
        int impar = 0;
        for (int i=0; i<10 ;i++ ) {
            if (listaInts.get(i) % 2 == 0) {
                par++;
            }else{
                impar++;
            }
        }
        System.out.printf("Numeros impares: %d \nNumeros pares: %d \n",impar,par);
    }
}