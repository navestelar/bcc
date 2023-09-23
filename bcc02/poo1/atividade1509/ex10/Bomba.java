package ex10;

public class Bomba {
    private double totalLitros;
    private float valorLitro;

    public Bomba(double totalLitros, float valorLitro) {
        this.totalLitros = totalLitros;
        this.valorLitro = valorLitro;
    }

    public boolean abastecerPorLitro(int litros) {
        if(litros>totalLitros)
            return false;
        return true;
    }

    public boolean abastecerPorValor(int valor) {
        if((valor/valorLitro)>totalLitros)
            return false;
        return true;
    }

    public double getTotalLitros() {
        return totalLitros;
    }
    public void setTotalLitros(double totalLitros) {
        this.totalLitros = totalLitros;
    }
    public float getValorLitro() {
        return valorLitro;
    }
    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }

    @Override
    public String toString() {
        return "Bomba [totalLitros=" + totalLitros + ", valorLitro=" + valorLitro + "]";
    }
}
