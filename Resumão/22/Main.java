// 22) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
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
        System.out.printf("%d\n",listaInts.get(0));
	}
}