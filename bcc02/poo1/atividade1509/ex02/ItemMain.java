package ex02;

public class ItemMain {
    public static void main(String[] args) {
        Item item = new Item(0, "item");
        System.out.println(item.toString());

        Livro livro = new Livro(1, "livro", null);
        System.out.println(livro.toString());

        Midia midia = new Midia(3, "midia", null, 0);
        System.out.println(midia.toString());

        CD cd = new CD(4, "cd", null, 0, 0, null, null);
        System.out.println(cd.toString());

        VHS vhs = new VHS(5, "vhs", null, 0, null);
        System.out.println(vhs.toString());
    }
}
