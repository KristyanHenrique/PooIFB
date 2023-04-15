// 23) Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2
// maiores.

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.printf("Insira 3 Valores\n");
		
        ArrayList<Integer> listaInts = new ArrayList<Integer>();
        
        for (int i=0;i<3 ;i++ ) {
            listaInts.add(scan.nextInt());
        }
        
        Collections.sort(listaInts, Collections.reverseOrder());
        int soma = listaInts.get(0)+listaInts.get(1);
        System.out.printf("%d\n",soma);
	}
}