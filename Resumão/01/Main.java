//1) Faça uma algoritmo que calcule o perímetro do triângulo. O programa deve receber 3 números inteiros como parâmetro e deve retornar o valor do perímetro.

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scan =  new Scanner(System.in);
		System.out.printf("Insira 3 Valores\n");
		
        ArrayList<Integer> listaInts = new ArrayList<Integer>();
        
        for (int i=0;i<3 ;i++ ) {
            listaInts.add(scan.nextInt());
        }
        Integer perimetro = 0;
        for (int i=0; i<3 ;i++ ) {
            perimetro = listaInts.get(i)+perimetro;
        }
        System.out.printf("O perimetro e: %d \n",perimetro);
    }
}

