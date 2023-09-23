package ex05;

public class Cachorro {
    private String raca;

    public Cachorro(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorro [raca=" + raca + "]";
    }
}
