// 46) Escreva um algoritmo que calcule e imprima a tabuada do 8 (1 a 10).
public class Main {
    public static void main(String[] args) {
        int num = 8;
        for (int i = 1; i <= 10; i++) {
            int res = num * i;
            System.out.println(num + " x " + i + " = " + res);
        }
    }
}
