package ex02;

public class Livro extends Item {
    private String autor;

    public Livro(int codigo, String descricao, String autor) {
        super(codigo, descricao);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro [autor=" + autor + "]";
    }
    
}
