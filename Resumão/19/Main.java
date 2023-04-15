// 19) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
// escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
// ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'
import java.util.*;

public class Main{
    public static void main(String atgs[]){
        Scanner scan =  new Scanner(System.in);
        int conta = scan.nextInt();
        float saldo = scan.nextFloat();
        float debito = scan.nextFloat();
        float credito = scan.nextFloat();

        saldo = saldo - debito + credito;
        if(saldo>0){
            System.out.printf("Saldo Positivo");    
        }else{
            System.out.printf("Saldo Negativo");
        }
        System.out.printf(" final é: %.2f\n",saldo);
    }
}