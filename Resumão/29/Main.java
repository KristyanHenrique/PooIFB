// 31) Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
// diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
// mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser apresentado outro valor que é a
// senha. Se esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha
// incorreta’. Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("insira o usuario");
        int usuario = scan.nextInt();
        if(usuario == 1234){
            System.out.println("insira a senha");
            int usuario = scan.nextInt();
            if (usuario == 9999){
                System.out.println("Acesso autorizado");
            }else{
                System.out.println("Senha incorreta");
            }
        }else{
            System.out.println("usuario invalido");
        }
	}
}