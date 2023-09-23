package ex03;

public class ContaEspecial extends Conta {
    private int diasSemJuros;
    private double limite;
    
    @Override
    public boolean saque(double valor) {
        if(valor>(getSaldo()+limite)) {
            return false;
        }
        
        setSaldo(getSaldo()-valor);
        return true;
    }  

    public ContaEspecial(String banco, int agencia, int numeroConta, double saldo, int diasSemJuros, double limite) {
        super(banco, agencia, numeroConta, saldo);
        this.diasSemJuros = diasSemJuros;
        this.limite = limite;
    }

    public int getDiasSemJuros() {
        return diasSemJuros;
    }
    public void setDiasSemJuros(int diasSemJuros) {
        this.diasSemJuros = diasSemJuros;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaEspecial [diasSemJuros=" + diasSemJuros + ", limite=" + limite + super.toString() + "]";
    }
}
