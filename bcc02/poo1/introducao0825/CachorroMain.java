public class CachorroMain {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.setPeso(1);
        c.setNome("Alfredo");
        c.setRaca("Golden");
        c.setTamanho(10);
        
        System.out.println(c.getNome());
    }
}
