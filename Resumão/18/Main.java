// 18) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se
// que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
// ultrapassar este valor, calcular e escrever o seu salário total.
import java.util.*;

public class Main{
    public static void main(String atgs[]){
        Scanner scan =  new Scanner(System.in);
        float salario = scan.nextFloat();
        float vendas = scan.nextFloat();

        if (vendas >= 1500){
            salario = (vendas*0.05f)+salario;
        }else{
            salario = (vendas*0.03f)+salario;
        }

        System.out.printf("Salario final é: %.2f\n",salario);
    }
}