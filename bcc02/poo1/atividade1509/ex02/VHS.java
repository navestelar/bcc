package ex02;

public class VHS extends Midia {
    private String titulo;

    public VHS(int codigo, String descricao, String gravadora, float duracao, String titulo) {
        super(codigo, descricao, gravadora, duracao);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "VHS [titulo=" + titulo + "]";
    }

}
