package Game;

import java.util.Random;

public class ComputadorC extends Computador{//IA com ''inteligência melhorada'', tentando vencer
    public void jogada(Tabuleiro[][] campo) {
        Random random = new Random();

        while (true) {//Ele irá checar se há dois campos selecionados para poder ganhar, se não fará uma jogada aleatória
            if(campo[0][0].getSimbolo() == 'O'&&campo[0][1].getSimbolo() == 'O'&&campo[0][2].getSimbolo()==' '){
                campo[0][2].setSimbolo('O');
                break;
            }else if(campo[0][0].getSimbolo() == 'O'&&campo[0][2].getSimbolo() == 'O'&&campo[0][1].getSimbolo()==' '){
                campo[0][1].setSimbolo('O');
                break;
            }else if(campo[0][1].getSimbolo() == 'O'&&campo[0][2].getSimbolo() == 'O'&&campo[0][0].getSimbolo()==' '){
                campo[0][0].setSimbolo('O');
                break;
            }else if(campo[1][0].getSimbolo() == 'O'&&campo[1][1].getSimbolo() == 'O'&&campo[1][2].getSimbolo()==' '){
                campo[1][2].setSimbolo('O');
                break;
            } else if(campo[1][2].getSimbolo() == 'O'&&campo[1][2].getSimbolo() == 'O'&&campo[1][1].getSimbolo()==' '){
                campo[1][1].setSimbolo('O');
                break;
            }else if(campo[1][1].getSimbolo() == 'O'&&campo[1][2].getSimbolo() == 'O'&&campo[1][0].getSimbolo()==' '){
                campo[1][0].setSimbolo('O');
                break;
            }else if(campo[2][0].getSimbolo() == 'O'&&campo[2][1].getSimbolo() == 'O'&&campo[2][2].getSimbolo()==' '){
                campo[2][2].setSimbolo('O');
                break;
            }else if(campo[2][0].getSimbolo() == 'O'&&campo[2][2].getSimbolo() == 'O'&&campo[2][1].getSimbolo()==' '){
                campo[2][1].setSimbolo('O');
                break;
            }else if(campo[2][1].getSimbolo() == 'O'&&campo[2][2].getSimbolo() == 'O'&&campo[2][0].getSimbolo()==' '){
                campo[2][0].setSimbolo('O');
                break;
            }else if(campo[0][0].getSimbolo() == 'O'&&campo[1][0].getSimbolo() == 'O'&&campo[2][0].getSimbolo()==' '){
                campo[2][0].setSimbolo('O');
                break;
            }else if(campo[0][0].getSimbolo() == 'O'&&campo[2][0].getSimbolo() == 'O'&&campo[1][0].getSimbolo()==' '){
                campo[1][0].setSimbolo('O');
                break;
            }else if(campo[1][0].getSimbolo() == 'O'&&campo[2][0].getSimbolo() == 'O'&&campo[0][0].getSimbolo()==' '){
                campo[0][0].setSimbolo('O');
                break;
            }else if(campo[0][1].getSimbolo() == 'O'&&campo[1][1].getSimbolo() == 'O'&&campo[2][1].getSimbolo()==' '){
                campo[2][1].setSimbolo('O');
                break;
            }else if(campo[0][1].getSimbolo() == 'O'&&campo[2][1].getSimbolo() == 'O'&&campo[1][1].getSimbolo()==' '){
                campo[1][1].setSimbolo('O');
                break;
            }else if(campo[1][1].getSimbolo() == 'O'&&campo[2][1].getSimbolo() == 'O'&&campo[0][1].getSimbolo()==' '){
                campo[0][1].setSimbolo('O');
                break;
            }else if(campo[0][2].getSimbolo() == 'O'&&campo[1][2].getSimbolo() == 'O'&&campo[2][2].getSimbolo()==' '){
                campo[2][2].setSimbolo('O');
                break;
            }else if(campo[0][2].getSimbolo() == 'O'&&campo[2][2].getSimbolo() == 'O'&&campo[1][2].getSimbolo()==' '){
                campo[1][2].setSimbolo('O');
                break;
            }else if(campo[1][2].getSimbolo() == 'O'&&campo[2][2].getSimbolo() == 'O'&&campo[0][2].getSimbolo()==' '){
                campo[0][2].setSimbolo('O');
                break;
            }else if(campo[0][0].getSimbolo() == 'O'&&campo[1][1].getSimbolo() == 'O'&&campo[2][2].getSimbolo()==' '){
                campo[2][2].setSimbolo('O');
                break;
            }else if(campo[0][0].getSimbolo() == 'O'&&campo[2][2].getSimbolo() == 'O'&&campo[1][1].getSimbolo()==' '){
                campo[1][1].setSimbolo('O');
                break;
            }else if(campo[1][1].getSimbolo() == 'O'&&campo[2][2].getSimbolo() == 'O'&&campo[0][0].getSimbolo()==' '){
                campo[0][0].setSimbolo('O');
                break;
            }else if(campo[0][2].getSimbolo() == 'O'&&campo[1][1].getSimbolo() == 'O'&&campo[2][0].getSimbolo()==' '){
                campo[2][0].setSimbolo('O');
                break;
            }else if(campo[0][2].getSimbolo() == 'O'&&campo[2][0].getSimbolo() == 'O'&&campo[1][1].getSimbolo()==' '){
                campo[1][1].setSimbolo('O');
                break;
            }else if(campo[1][1].getSimbolo() == 'O'&&campo[2][0].getSimbolo() == 'O'&&campo[0][2].getSimbolo()==' '){
                campo[0][2].setSimbolo('O');
                break;
            }
            p[0] = random.nextInt(3);
            p[1] = random.nextInt(3);
            if (campo[p[0]][p[1]].getSimbolo() == ' ') {
                campo[p[0]][p[1]].setSimbolo('O');
                break;
            } else {
                continue;
            }
        }
    }
}
