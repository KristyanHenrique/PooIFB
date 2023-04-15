//4) Faça um programa que leia quatro palavras pelo teclado, e armazene cada palavra em uma string. Depois, concatene todas as strings lidas numa única string. Por fim apresente esta como resultado ao final do programa. 
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String s1 = new String();
        String s2 = new String();
        String s3 = new String();
        String s4 = new String();
        System.out.printf("\nInsira 4 palavras (Pressione enter a cada palavra)\n");
        s1 = scan.next();
        s2 = scan.next();
        s3 = scan.next();
        s4 = scan.next();
        s1 = s1.concat(" ").concat(s2).concat(" ").concat(s3).concat(" ").concat(s4);
        System.out.printf("%s\n", s1);

    }
}