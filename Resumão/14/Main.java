// 14) Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

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
        Integer maior = null;
        for (int i=0; i<2 ;i++ ) {
            if ((maior == null) || (listaInts.get(i)>maior)) {
                maior = listaInts.get(i);
            }
        }
        System.out.printf("O maior numero e: %d \n",maior);
        
	}
}
