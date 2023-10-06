package ex11xadrez;

public class Torre extends Peca {
    public boolean mover(int linha, int coluna) {
        if(this.getLinha()==linha || this.getColuna()==coluna) 
            return true;
        return false;
    }

    public Torre(int linha, int coluna, boolean cor, int movimentos) {
        super(linha, coluna, cor, movimentos);
    }

    @Override
    public String toString() {
        return "Torre []";
    }
    
}
