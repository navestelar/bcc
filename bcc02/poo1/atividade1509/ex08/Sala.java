package ex08;

public class Sala extends Ambiente {
    private boolean tv;

    public Sala(float area, boolean tv) {
        super(area);
        this.tv = tv;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    @Override
    public String toString() {
        return "Sala [tv=" + tv + "]";
    }
}
