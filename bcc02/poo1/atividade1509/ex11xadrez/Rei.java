package ex11xadrez;

public class Rei extends Peca {

    public Rei(int linha, int coluna, boolean cor, int movimentos) {
        super(linha, coluna, cor, movimentos);
    }

    @Override
    public String toString() {
        return "Rei []";
    }
    
}
