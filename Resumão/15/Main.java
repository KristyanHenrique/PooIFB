// 15) Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.printf("Insira 2 Valores\n");
		
        ArrayList<Integer> listaInts = new ArrayList<Integer>();
        
        for (int i=0;i<2 ;i++ ) {
            listaInts.add(scan.nextInt());
        }

        if (listaInts.get(0)>listaInts.get(1)) {
            System.out.printf("%d %d",listaInts.get(0),listaInts.get(1));
        }else{
            System.out.printf("%d %d",listaInts.get(1),listaInts.get(0));
        }
	}
}
