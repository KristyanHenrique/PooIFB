// 26) Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
// do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.printf("Insira os nomes dos times\n");
		String t1 = sc.next();
        String t2 = sc.next();
        System.out.printf("Insira os gols dos times\n");
		int g1 = sc.nextInt();
        int g2 = sc.nextInt();

        if(g1==g2){
            System.out.printf("Empate\n");
        }if(g1>g2){
            System.out.printf("%s ganhou\n",t1);
        }else{
            System.out.printf("%s ganhou\n",t2);
        }
	}
}