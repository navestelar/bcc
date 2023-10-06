public class Documento {
    private String texto;

    public Documento() {
    }

    public Documento(String texto) {
        setTexto(texto);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Documento [texto=" + texto + "]";
    }
    
}