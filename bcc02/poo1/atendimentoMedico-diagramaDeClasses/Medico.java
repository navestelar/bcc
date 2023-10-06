public class Medico extends Pessoa {
    private String especialidade;

    public Medico(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Medico [especialidade=" + especialidade + super.toString() + "]";
    }
    
}
