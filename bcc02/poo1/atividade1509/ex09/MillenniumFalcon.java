package ex09;

public class MillenniumFalcon extends Apolo11 {
    private float classeHiperpropulsor;

    public MillenniumFalcon(double velocidadeMaxima, String tipoCombustivel, float classeHiperpropulsor) {
        super(velocidadeMaxima, tipoCombustivel);
        this.classeHiperpropulsor = classeHiperpropulsor;
    }

    public float getClasseHiperpropulsor() {
        return classeHiperpropulsor;
    }

    public void setClasseHiperpropulsor(float classeHiperpropulsor) {
        this.classeHiperpropulsor = classeHiperpropulsor;
    }

    @Override
    public String toString() {
        return "MillenniumFalcon [classeHiperpropulsor=" + classeHiperpropulsor + "]";
    } 
}
