package ex07;

public class Professor {
    private String disciplina;

    public Professor(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor [disciplina=" + disciplina + "]";
    }
}
