// 13) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
// poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu)

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.printf("Insira o ano atual e o de nascimento\n");
		
        ArrayList<Integer> listaNotas = new ArrayList<Integer>();
        
        for (int i=0;i<2 ;i++ ) {
            listaNotas.add(scan.nextInt());
        }
        int idade = (listaNotas.get(0)-listaNotas.get(1));

        if(idade>=16){
            System.out.printf("Pode votar\n");
        }else{
            System.out.printf("Não Pode votar\n");
        }
        
        
	}
}
