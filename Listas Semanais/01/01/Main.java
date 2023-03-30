import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.printf("Insira as Horas\n");
		int hora = scan.nextInt();
		
		System.out.printf("Insira os minutos\n");
		int minuto = scan.nextInt();
		
		System.out.printf("Insira os segundos\n");
		int secs = scan.nextInt();
		
		hora = ((hora*60)*60)+(minuto*60) + secs;
		
		System.out.printf("O tempo em segundos é: %d", hora);
	}
}
