// 24) Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem
// crescente.

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
        
        Collections.sort(listaInts);
        for (int i=0;i<3 ;i++ ) {
            System.out.printf("%d ",listaInts.get(i));
        }
        System.out.printf("\n");
	}
}