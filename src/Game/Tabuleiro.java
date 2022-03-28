package Game;

public class Tabuleiro {//Aqui é onde faz com que cada quadrado ou região selecionavel do jogo seja marcada como
                                    // vazia ou com símbolo
    private char simbolo;

    public Tabuleiro(){
        this.simbolo = ' ';
    }
    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        if (this.simbolo == ' '){
            this.simbolo=simbolo;}
    }
}
