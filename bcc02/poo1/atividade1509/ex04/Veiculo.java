package ex04;

public class Veiculo {
    private boolean motor;

    public Veiculo(boolean motor) {
        this.motor = motor;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Veiculo [motor=" + motor + "]";
    }
}
