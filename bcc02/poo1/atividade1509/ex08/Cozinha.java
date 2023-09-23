package ex08;

public class Cozinha extends Ambiente {
    private boolean microondas;

    public Cozinha(float area, boolean microondas) {
        super(area);
        this.microondas = microondas;
    }

    public boolean isMicroondas() {
        return microondas;
    }

    public void setMicroondas(boolean microondas) {
        this.microondas = microondas;
    }

    @Override
    public String toString() {
        return "Cozinha [microondas=" + microondas + "]";
    }
}
