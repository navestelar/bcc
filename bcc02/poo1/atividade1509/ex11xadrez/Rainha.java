package ex11xadrez;

public class Rainha extends Peca {

    public Rainha(int linha, int coluna, boolean cor, int movimentos) {
        super(linha, coluna, cor, movimentos);
    }

    @Override
    public String toString() {
        return "Rainha []";
    }
    
}
