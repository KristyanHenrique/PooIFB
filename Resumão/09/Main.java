// 9) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
// contrário escrever NÃO É MAIOR QUE 10!

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.printf("Insira um numero\n");
		
        int numero = scan.nextInt();
        
        if(numero > 10){
            System.out.printf("É MAIOR QUE 10!");
        } else {
            System.out.printf("NÃO É MAIOR QUE 10!");
        }
    }
}