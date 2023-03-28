//3 Construa um programa que solicite uma frase escrita pelo usuário. Peça ao usuário para escolher uma palavra da frase escrita e retornar um índice referente à posição da palavra. (Utilize o método indexOf()).
import java.util.*;
public class Main {
    public static void main(String args[]){
        System.out.printf("Insira uma Frase \n");
        Scanner scan = new Scanner(System.in);
        String frase = scan.next();
        System.out.printf("%s \n",frase);
        
    }
}