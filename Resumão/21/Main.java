// 21) Ler um valor e escrever se é positivo, negativo ou zero
import java.util.*;

public class Main{
    public static void main(String atgs[]){
        Scanner scan =  new Scanner(System.in);
        int valor = scan.nextInt();

        if (valor > 0){
            System.out.printf("Positivo\n");    
        }else if (valor == 0){
            System.out.printf("Zero\n");
        }else{
            System.out.printf("Negativo\n");
        }
    }
}