package ex05;

public class Mamifero extends Animal {
    private String numeroMamas;

    public Mamifero(String nome, int idade, String numeroMamas) {
        super(nome, idade);
        this.numeroMamas = numeroMamas;
    }

    public String getNumeroMamas() {
        return numeroMamas;
    }

    public void setNumeroMamas(String numeroMamas) {
        this.numeroMamas = numeroMamas;
    }

    @Override
    public String toString() {
        return "Mamifero [numeroMamas=" + numeroMamas + "]";
    }
}
