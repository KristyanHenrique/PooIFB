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
        
        Collections.sort(listaInts);
        System.out.printf("%d %d \n",listaInts.get(0),listaInts.get(1));
	}
}
