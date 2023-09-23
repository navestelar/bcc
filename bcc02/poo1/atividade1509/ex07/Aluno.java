package ex07;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(int codigo, String nome, String endereco, int matricula) {
        super(codigo, nome, endereco);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + "]";
    }
}
