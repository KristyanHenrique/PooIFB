//3 Construa um programa que solicite uma frase escrita pelo usuário. Peça ao usuário para escolher uma palavra da frase escrita e retornar um índice referente à posição da palavra. (Utilize o método indexOf()).
import java.util.*;
public class Main {
    public static void main(String args[]){
        System.out.printf("Insira uma Frase \n");
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();

        System.out.printf("Insira uma palavra da Frase \n");
        String palavra = scan.next();

        int pos = frase.indexOf(palavra, 0);
        if(pos >=0){
            System.out.printf("A palavra %s inicia na posicao %d e termina na posicao %d \n",palavra,pos,(palavra.length()+pos));    
        }else{
            System.out.printf("A palavra %s Não foi encontrada\n",palavra);    
        }        
    }
}