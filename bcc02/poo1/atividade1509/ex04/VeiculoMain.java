package ex04;

public class VeiculoMain {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo(false);
        System.out.println(veiculo.toString());

        Carro carro = new Carro(false, 4);
        System.out.println(carro.toString());

        Caminhao caminhao = new Caminhao(false, 6);
        System.out.println(caminhao.toString());

        Moto moto = new Moto(false, 2);
        System.out.println(moto.toString());
    }
}
