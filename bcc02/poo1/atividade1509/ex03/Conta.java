package ex03;

public class Conta {
    private String banco = "caixa";
    private int agencia = 123;
    private int numeroConta;
    private double saldo = 0;

    public Conta(String banco, int agencia, int numeroConta, double saldo) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public boolean deposito(double valor) {
        if(valor<0)
            return false;
        saldo+=valor;
        return true;
    }

    public boolean saque(double valor) {
        if (valor>saldo) {
            return false;
        }

        saldo -= valor;
        return true;
    }
    
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        if (!banco.equals(""))
            this.banco = banco;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        if(agencia!=0)
            this.agencia = agencia;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public String toString() {
        return "Conta [banco=" + banco + ", agencia=" + agencia + ", numeroConta=" + numeroConta + ", saldo=" + saldo
                + "]";
    }
}
