// 20) Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
// quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
// média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
// a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
// compra'.
import java.util.*;

public class Main{
    public static void main(String atgs[]){
        Scanner scan =  new Scanner(System.in);
        int qtdAtual = scan.nextInt();
        int qtdMax = scan.nextInt();
        int qtdMin = scan.nextInt();
        
        float media = (qtdMax+qtdMin)/2;

        if(qtdAtual >= media){
            System.out.printf("Não efetuar compra\n");    
        }else{
            System.out.printf("Efetuar compra\n"); 
        }

        
    }
}