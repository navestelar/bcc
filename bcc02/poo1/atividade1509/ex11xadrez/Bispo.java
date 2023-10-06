package ex11xadrez;

public class Bispo extends Peca {

    public Bispo(int linha, int coluna, boolean cor, int movimentos) {
        super(linha, coluna, cor, movimentos);
    }

    public boolean mover(int linha, int coluna) {
        if((this.getLinha()-linha == this.getColuna()-coluna) || ((this.getLinha()-linha == (this.getColuna())*(-1))))
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Bispo []";
    }
    
}
