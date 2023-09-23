package ex03;

public class ContaSimples extends Conta {
    private double saldoPoupanca;

    public boolean depositoPoupanca(double valor) {
        if(valor<0)
            return false;
        saldoPoupanca+=valor;
        return true;
    }

    public boolean saquePoupanca(double valor) {
        if (valor>saldoPoupanca) {
            return false;
        }

        saldoPoupanca-=valor;
        return true;
    }

    public ContaSimples(String banco, int agencia, int numeroConta, double saldo, double saldoPoupanca) {
        super(banco, agencia, numeroConta, saldo);
        this.saldoPoupanca = saldoPoupanca;
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    @Override
    public String toString() {
        return "ContaSimples [saldoPoupanca=" + saldoPoupanca + super.toString() + "]";
    }
    
}
