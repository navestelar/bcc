package ex05;

public class Reptil extends Animal {
    private int qtdOvos;

    public Reptil(String nome, int idade, int qtdOvos) {
        super(nome, idade);
        this.qtdOvos = qtdOvos;
    }

    public int getQtdOvos() {
        return qtdOvos;
    }

    public void setQtdOvos(int qtdOvos) {
        this.qtdOvos = qtdOvos;
    }

    @Override
    public String toString() {
        return "Reptil [qtdOvos=" + qtdOvos + "]";
    }
}
