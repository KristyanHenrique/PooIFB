// 16) Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem
// os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo
// é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int horaInicio, horaFim, duracao;

        System.out.print("Digite a hora de início do jogo: ");
        horaInicio = scan.nextInt();
        System.out.print("Digite a hora de fim do jogo: ");
        horaFim = scan.nextInt();

        if (horaFim <= horaInicio) {
            duracao = 24 - horaInicio + horaFim;
        } else {
            duracao = horaFim - horaInicio;
        }

        System.out.println("A duração do jogo foi de " + duracao + " horas.");
    }
}
