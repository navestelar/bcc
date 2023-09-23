public class PessoaFisica extends Pessoa {
    private String cpf;
    private String estadoCivil;
    public PessoaFisica(String nome, String endereco, String cpf, String estadoCivil) {
        super(nome, endereco);
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "PessoaFisica [cpf=" + cpf + ", estadoCivil=" + estadoCivil + "]";
    }
}
