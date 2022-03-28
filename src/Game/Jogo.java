package Game;

import java.util.Scanner;

public class Jogo {
    public static void main(String []args){
        Tabuleiro[][] campo = new Tabuleiro[3][3];
        char simboloAtual = 'X';
        boolean game = true;
        String vitoria;
        Scanner teclado = new Scanner(System.in);
        Computador cpu = new Computador();
        int dificuldade;
        int rodadas =0;

        IniciarJogo(campo);
        System.out.println("        Jogo da Velha");
        System.out.println("-----------------------------");
        while (true){
            System.out.println("Escolha uma dificuldade: 1,2 ou 3");
            dificuldade = teclado.nextInt();
            System.out.println("-----------------------------");
            if (dificuldade == 1){
                cpu = new ComputadorA();
                break;
            }else if (dificuldade == 2){
                cpu = new ComputadorB();
                break;
            }else if (dificuldade == 3){
                cpu = new ComputadorC();
                break;
            }else {
                System.out.println("Valor invalido");
                continue;
            }
        }
        while (game){
            vitoria = verificarVitoria(campo);
            modelador(campo);
            if (!vitoria.equals("")){
                System.out.printf("O time do símbolo -> %s ganhou%n",vitoria);//retorna o simbolo mostrado na função de vitória
                break;
            }
            try {
                //É onde  o jogo funciona
                if (verificarJogada(campo,jogar(teclado,simboloAtual),simboloAtual)) {
                    rodadas ++;
                    if (rodadas ==9){//checador de empate
                        System.out.printf("Empate");
                        break;
                    }
                     if (simboloAtual == 'X'){
                        //simboloAtual = 'X';  //usando esse comando e apagando o debaixo, fará com que o jogo seja para
                         cpu.jogada(campo);         //dois jogadores humanos
                         rodadas ++;
                    }else {
                        simboloAtual = 'X';
                    }
                }
            }catch (Exception e){
                System.out.println("Erro");
            }
        }
        System.out.print("\n Fim de jogo ");
    }
    public static void modelador(Tabuleiro[][] campo){//Função que desenha o jogo
        System.out.println("   0   1   2");
        System.out.printf("0  %c | %c | %c %n",campo[0][0].getSimbolo(),campo[0][1].getSimbolo(),campo[0][2].getSimbolo());
        System.out.println("  ------------");
        System.out.printf("1  %c | %c | %c %n",campo[1][0].getSimbolo(),campo[1][1].getSimbolo(),campo[1][2].getSimbolo());
        System.out.println("  ------------");
        System.out.printf("2  %c | %c | %c %n",campo[2][0].getSimbolo(),campo[2][1].getSimbolo(),campo[2][2].getSimbolo());
    }
    public static String verificarVitoria(Tabuleiro[][] campo){
        if (campo[0][0].getSimbolo() == 'O'&& campo[0][1].getSimbolo()=='O'&& campo[0][2].getSimbolo()=='O'||
                campo[1][0].getSimbolo() == 'O'&& campo[1][1].getSimbolo()=='O'&& campo[1][2].getSimbolo()=='O'||
                campo[2][0].getSimbolo() == 'O'&& campo[2][1].getSimbolo()=='O'&& campo[2][2].getSimbolo()=='O'||
                campo[0][0].getSimbolo() == 'O'&& campo[1][0].getSimbolo()=='O'&& campo[2][0].getSimbolo()=='O'||
                campo[0][1].getSimbolo() == 'O'&& campo[1][1].getSimbolo()=='O'&& campo[2][1].getSimbolo()=='O'||
                campo[0][2].getSimbolo() == 'O'&& campo[1][2].getSimbolo()=='O'&& campo[2][2].getSimbolo()=='O'||
                campo[0][0].getSimbolo() == 'O'&& campo[1][1].getSimbolo()=='O'&& campo[2][2].getSimbolo()=='O'||
                campo[0][2].getSimbolo() == 'O'&& campo[1][1].getSimbolo()=='O'&& campo[2][0].getSimbolo()=='O'){
            return "O";
        }else if (campo[0][0].getSimbolo() == 'X'&& campo[0][1].getSimbolo()=='X'&& campo[0][2].getSimbolo()=='X'||
                campo[1][0].getSimbolo() == 'X'&& campo[1][1].getSimbolo()=='X'&& campo[1][2].getSimbolo()=='X'||
                campo[2][0].getSimbolo() == 'X'&& campo[2][1].getSimbolo()=='X'&& campo[2][2].getSimbolo()=='X'||
                campo[0][0].getSimbolo() == 'X'&& campo[1][0].getSimbolo()=='X'&& campo[2][0].getSimbolo()=='X'||
                campo[0][1].getSimbolo() == 'X'&& campo[1][1].getSimbolo()=='X'&& campo[2][1].getSimbolo()=='X'||
                campo[0][2].getSimbolo() == 'X'&& campo[1][2].getSimbolo()=='X'&& campo[2][2].getSimbolo()=='X'||
                campo[0][0].getSimbolo() == 'X'&& campo[1][1].getSimbolo()=='X'&& campo[2][2].getSimbolo()=='X'||
                campo[0][2].getSimbolo() == 'X'&& campo[1][1].getSimbolo()=='X'&& campo[2][0].getSimbolo()=='X'){
            return "X";
        }else {return "";}
    }//deixei como retorno um simbolo, para caso o haja a troca de tipo de adversário
    public static boolean verificarJogada(Tabuleiro[][] campo,int[] p,char simboloAtual){
        if (campo[p[0]][p[1]].getSimbolo()==' '){
            campo[p[0]][p[1]].setSimbolo(simboloAtual);
            return true;
        }else {
            return false;
        }
    }
    public static int[] jogar(Scanner tecaldo,char simboloAtual){//Função responsavel pelo movimento do(s) jogador(es) humano(s)
        int[] p=new int[2];
        System.out.printf("%s %c %n","Quem joga é o time -> ",simboloAtual);
        System.out.println("Informe a linha:");
        p[0] = tecaldo.nextInt();
        System.out.println("Informe a coluna:");
        p[1] = tecaldo.nextInt();
        return p;
    }
    public static void IniciarJogo(Tabuleiro[][] campo){//Função inicia o desenho do game
        for (int l=0;l<3;l++){
            for (int c=0;c<3;c++){
                campo[l][c]=new Tabuleiro();
            }
        }
    }
}
