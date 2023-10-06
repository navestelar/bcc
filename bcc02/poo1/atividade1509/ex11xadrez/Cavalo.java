package ex11xadrez;

public class Cavalo extends Peca {

    public Cavalo(int linha, int coluna, boolean cor, int movimentos) {
        super(linha, coluna, cor, movimentos);
    }

    public boolean mover(int coluna, int linha) {
        if (((((this.getColuna()-coluna)==1)||(this.getColuna()-coluna)==-1)&&((this.getColuna()-coluna)==2)||(this.getColuna()-coluna)==-2)||((((this.getColuna()-coluna)==2)||(this.getColuna()-coluna)==-2)&&((this.getColuna()-coluna)==1)||(this.getColuna()-coluna)==-1)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cavalo []";
    }
    
}
