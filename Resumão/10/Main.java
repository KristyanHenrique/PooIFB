// 10) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.printf("Insira um numero\n");
		
        int numero = scan.nextInt();
        
        if(numero >= 0){
            System.out.printf("É POSITIVO!");
        } else {
            System.out.printf("É NEGATIVO!");
        }
    }
}