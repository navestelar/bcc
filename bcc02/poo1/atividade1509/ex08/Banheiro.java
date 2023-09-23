package ex08;

public class Banheiro extends Ambiente {
    private boolean banheira;

    public Banheiro(float area, boolean banheira) {
        super(area);
        this.banheira = banheira;
    }

    public boolean isBanheira() {
        return banheira;
    }

    public void setBanheira(boolean banheira) {
        this.banheira = banheira;
    }

    @Override
    public String toString() {
        return "Banheiro [banheira=" + banheira + "]";
    }
    
}
