package ex03;

public class ContaMain {
    public static void main(String[] args) {
        Conta conta = new Conta(null, 0, 0, 1000);
        System.out.println(conta.toString());

        conta.deposito(2000);
        conta.saque(1000);
        System.out.println(conta.toString());
        conta.saque(3000);
        System.out.println(conta.toString());

        ContaSimples contaSimples = new ContaSimples(null, 0, 0, 1000, 1000);
        System.out.println(contaSimples.toString());
        contaSimples.saquePoupanca(500);
        contaSimples.saque(1000);
        System.out.println(contaSimples.toString());
        contaSimples.saquePoupanca(1000);
        contaSimples.saque(1000);
        System.out.println(contaSimples.toString());

        ContaEspecial contaEspecial = new ContaEspecial(null, 0, 0, 1000, 0, 2000);
        System.out.println(contaEspecial.toString());
        System.out.println(contaEspecial.deposito(-1));
        contaEspecial.saque(2000);
        contaEspecial.saque(3000);
        System.out.println(contaEspecial.toString());
    }
}
