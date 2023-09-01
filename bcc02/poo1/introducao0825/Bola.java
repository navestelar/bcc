public class Bola {
    // //modo1 (evitar)
    // // float tamanho;
    // // String tipo;
    
    // private float tamanho=100;
    // private String tipo="Futebol";
    
    
    // public void setTamanho(float tamanho) {
    //     if(tamanho>0){
    //         this.tamanho = tamanho;
    //     }
    // }
    // public void setTipo(String tipo) {
    //     if(tipo.length()>0){
    //         this.tipo = tipo;
    //     }
    // }
    // public float getTamanho() {
    //     return this.tamanho;
    // }
    // public String getTipo() {
    //     return this.tipo;
    // }
    
    // // public Bola(float tamanho, String tipo) {
    // //     this.tamanho = tamanho;
    // //     this.tipo = tipo;
    // // }

    private String esporte = "Futebol";
    private float tamanho = 100;
    private float peso = 5.2f;

    public void setTamanho(float tamanho) {
        if(tamanho>0){
            this.tamanho = tamanho;
        }
    }
    public void setTipo(String esporte) {
        if(esporte.length()>0){
            this.esporte = esporte;
        }
    }
    public void setPeso(float peso) {
        if(peso>0){
            this.peso = peso;
        }
    }
    public float getTamanho() {
        return tamanho;
    }
    public String getTipo() {
        return esporte;
    }
    public float getPeso() {
        return peso;
    }
}
