public class Impressora {
    private Documento documento;

    public Impressora(Documento documento) {
        setDocumento(documento);
    }

    public String imprimir() {
        return documento.getTexto();
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Impressora [documento=" + documento + "]";
    }
}
