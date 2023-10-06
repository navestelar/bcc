public class Paciente extends Pessoa {
    private Prioridade prioridade = new Prioridade();

    public Paciente(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int getPrioridade() {
        return prioridade.getNivelDePrioridade();
    }
}
