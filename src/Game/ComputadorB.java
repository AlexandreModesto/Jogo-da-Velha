package Game;

import java.util.Random;

public class ComputadorB extends Computador{//IA com jogadas aleatórias
    public void jogada(Tabuleiro[][] campo) {
        Random random = new Random();

        while (true) {
            p[0] = random.nextInt(3);//ele ira gerar um numero aleatorio num array de 3 valores e guardará no
            p[1] = random.nextInt(3);               //ponto designado
            if (campo[p[0]][p[1]].getSimbolo() == ' ') {
                campo[p[0]][p[1]].setSimbolo('O');
                break;
            } else {
                continue;
            }
        }
    }
}
