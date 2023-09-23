package ex11xadrez;

public class Peao extends Peca {
    public boolean mover(int linha, int coluna) {
        if ((this.getColuna()==coluna) && (this.getLinha()==linha-1) || (this.getLinha()==2 && linha==4))
            return true;
        return false;
    }

    public Peao(int linha, int coluna, boolean cor, int movimentos) {
        super(linha, coluna, cor, movimentos);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Peao []";
    }
    
}
