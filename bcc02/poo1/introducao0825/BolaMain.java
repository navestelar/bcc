public class BolaMain {
    public static void main(String[] args) {
        Bola bola1 = new Bola();
        // //modo1(evitar)
        // // bola1.tamanho=10.5f;
        // // bola1.tipo="Futebol";
        // // System.out.println(bola1.tamanho);
        // // System.out.println(bola1.tipo);
        
        // // modo2
        // bola1.setTamanho(10.5f);
        // bola1.setTipo("Futebol");
        // System.out.println(bola1.getTamanho());
        // System.out.println(bola1.getTipo());

        bola1.setPeso(10);
        bola1.setTamanho(50);
        bola1.setEsporte("Volei");

        Bola bola2 = new Bola(10, 5.2f, "Handbol");

        System.out.println(bola1.toString());
        System.out.println(bola2.toString());
    }
}
