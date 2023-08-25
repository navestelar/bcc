public class Bola {
    //modo1 (evitar)
    // float tamanho;
    // String tipo;
    private float tamanho=100;
    private String tipo="Futebol";
    
    
    public void setTamanho(float tamanho) {
        if(tamanho>0){
            this.tamanho = tamanho;
        }
    }
    public void setTipo(String tipo) {
        if(tipo.length()>0){
            this.tipo = tipo;
        }
    }
    public float getTamanho() {
        return this.tamanho;
    }
    public String getTipo() {
        return this.tipo;
    }
    // public Bola(float tamanho, String tipo) {
    //     this.tamanho = tamanho;
    //     this.tipo = tipo;
    // }

}