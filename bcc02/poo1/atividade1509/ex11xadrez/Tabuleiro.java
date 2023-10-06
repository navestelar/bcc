package ex11xadrez;

public class Tabuleiro {
    private String[][] tabuleiro = new String[7][7];
    
    public Tabuleiro() {
        
    }
    

    public void mostrarTabuleiro() {
        System.out.println(" +--+--+--+--+--+--+--+--+");
        System.out.println("1|Tp|Cp|Bp|Dp|Rp|Bp|Cp|Tp|");
        System.out.println(" +--+--+--+--+--+--+--+--+");
        System.out.println("2|Pp|Pp|Pp|Pp|Pp|Pp|Pp|Pp|");
        System.out.println(" +--+--+--+--+--+--+--+--+");
        System.out.println("3|  |  |  |  |  |  |  |  |");
        System.out.println(" +--+--+--+--+--+--+--+--+");
        System.out.println("4|  |  |  |  |  |  |  |  |");
        System.out.println(" +--+--+--+--+--+--+--+--+");
        System.out.println("5|  |  |  |  |  |  |  |  |");
        System.out.println(" +--+--+--+--+--+--+--+--+");
        System.out.println("6|  |  |  |  |  |  |  |  |");
        System.out.println(" +--+--+--+--+--+--+--+--+");
        System.out.println("7|Pb|Pb|Pb|Pb|Pb|Pb|Pb|Pb|");
        System.out.println(" +--+--+--+--+--+--+--+--+");
        System.out.println("8|Tb|Cb|Bb|Db|Rb|Bb|Cb|Tb|");
        System.out.println(" +--+--+--+--+--+--+--+--+");
        System.out.println("  a  b  c  d  e  f  g  h");
    }

    public String[][] getTabuleiro() {
        return tabuleiro;
    }
    public void setTabuleiro(String[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
}
