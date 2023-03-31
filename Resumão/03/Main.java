// 3) Escreva um algoritmo que permita fazer a conversão cambial entre reais e dólares. Considere como
// taxa de cambio US$ 1,00 = R$ 4,05. Leia uma valor em reais pelo teclado e mostre o correspondente
// em dólares.
import java.util.*;
public class Main{
    public static void main(String args[]){
        System.out.printf("Insira um valor em reias: ");
        Scanner scan = new Scanner(System.in);
        float dolar = scan.nextFloat();
        float valor = dolar*4.05F;

        System.out.printf("%.2f\n", valor);
    }
}