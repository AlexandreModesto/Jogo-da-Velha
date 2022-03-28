package Game;

public class ComputadorA extends Computador{//IA com jogadas pré programadas
    public void jogada(Tabuleiro[][] campo) {

        p[0] = 1;
        p[1] = 1;//1°jogada ou tentativa já que ele sempre tentará esse comando inicialmente e os subsequentes
        if (campo[p[0]][p[1]].getSimbolo() == ' ') {
            campo[p[0]][p[1]].setSimbolo('O');
        } else {
            p[0] = 0;
            p[1] = 0;//2°jogada
            if (campo[p[0]][p[1]].getSimbolo() == ' ') {
                campo[p[0]][p[1]].setSimbolo('O');
            }else {
                p[0] = 2;
                p[1] = 2;//3°jogada
                if (campo[p[0]][p[1]].getSimbolo() == ' ') {
                    campo[p[0]][p[1]].setSimbolo('O');
                }else{
                    p[0] = 2;
                    p[1] = 0;//4°jogada
                    if (campo[p[0]][p[1]].getSimbolo() == ' ') {
                        campo[p[0]][p[1]].setSimbolo('O');
                    }else {
                        p[0] = 1;
                        p[1] = 0;//5°jogada
                        if (campo[p[0]][p[1]].getSimbolo() == ' ') {
                            campo[p[0]][p[1]].setSimbolo('O');
                        }else {
                            p[0] = 0;
                            p[1] = 2;//6°jogada
                            if (campo[p[0]][p[1]].getSimbolo() == ' ') {
                                campo[p[0]][p[1]].setSimbolo('O');
                            }else {
                                p[0] = 0;
                                p[1] = 1;//7°jogada
                                if (campo[p[0]][p[1]].getSimbolo() == ' ') {
                                    campo[p[0]][p[1]].setSimbolo('O');
                                }else {
                                    p[0] = 2;
                                    p[1] = 1;//8°jogada
                                    if (campo[p[0]][p[1]].getSimbolo() == ' ') {
                                        campo[p[0]][p[1]].setSimbolo('O');
                                    }else {
                                        p[0] = 1;
                                        p[1] = 2;//9°jogada
                                        if (campo[p[0]][p[1]].getSimbolo() == ' ') {
                                            campo[p[0]][p[1]].setSimbolo('O');
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
