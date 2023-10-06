public class ImpressoraMain {
    public static void main(String[] args) {
        Documento documento = new Documento("AAAAAAAAAAAAAAAAAAAAA");
        Impressora impressora = new Impressora(documento);

        System.out.println(impressora.imprimir());
    }
}
