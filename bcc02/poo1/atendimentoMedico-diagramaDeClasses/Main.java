public class Main {
    public static void main(String[] args) {
        Perguntas perguntas = new Perguntas();
        String[] p = {"Pergunta 1", "Pergunta 2", "Pergunta 3", "Pergunta 4", "Pergunta 5"};
        perguntas.setPerguntas(p);
        
        Prioridade prioridade = new Prioridade();
        prioridade.fazerPerguntas(perguntas);
        System.out.println(prioridade.getNivelDePrioridade());

        Paciente paciente = new Paciente(prioridade);
        System.out.println(paciente.getPrioridade());

        Medico medico = new Medico("neuro");
        medico.setNome("a");
        medico.setDataNascimento("15/05/1980");
        System.out.println(medico.toString());

        Atendimento atendimento1 = new Atendimento(paciente, medico, null, null, null, null);
        System.out.println(atendimento1.toString());

        ListaAtendimento listaAtendimento = new ListaAtendimento();
        listaAtendimento.adicionarAtendimeto(atendimento1);
    }
}
