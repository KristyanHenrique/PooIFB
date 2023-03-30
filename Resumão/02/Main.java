//2) Escreva uma algoritmo que receba uma hora no formato de três números inteiros que representam: horas, minutos e segundos. Sua função deve calcular e retornar a quantidade total de segundos.

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scan =  new Scanner(System.in);
		System.out.printf("Insira 3 Valores representando horas, minutos e segundos  (Pressione enter a cada valor)\n");
		
        ArrayList<Integer> listaInts = new ArrayList<Integer>();
        
        for (int i=0;i<3 ;i++ ) {
            listaInts.add(scan.nextInt());
        }
        
        Integer horas = ((listaInts.get(0)*60)*60);
        Integer minutos = (listaInts.get(1)*60);
        Integer total = horas+minutos+listaInts.get(2);

        System.out.printf("Segundos: %d\n",total);
    }
}