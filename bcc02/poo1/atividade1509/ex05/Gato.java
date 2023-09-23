package ex05;

public class Gato extends Mamifero {
    private String cor;

    public Gato(String nome, int idade, String numeroMamas, String cor) {
        super(nome, idade, numeroMamas);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato [cor=" + cor + "]";
    }
}
