public class Atendimento {
    @Override
    public String toString() {
        return "Atendimento [paciente=" + paciente + ", medico=" + medico + ", horaChegada=" + horaChegada
                + ", horaSaida=" + horaSaida + ", horaAtendimentoInicio=" + horaAtendimentoInicio
                + ", horaAtendimentoFim=" + horaAtendimentoFim + "]";
    }
    private Paciente paciente;
    private Medico medico;
    private String horaChegada; 
    private String horaSaida;
    private String horaAtendimentoInicio;
    private String horaAtendimentoFim;

    public Atendimento(Paciente paciente, Medico medico, String horaChegada, String horaSaida,
            String horaAtendimentoInicio, String horaAtendimentoFim) {
        this.paciente = paciente;
        this.medico = medico;
        this.horaChegada = horaChegada;
        this.horaSaida = horaSaida;
        this.horaAtendimentoInicio = horaAtendimentoInicio;
        this.horaAtendimentoFim = horaAtendimentoFim;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public int getPrioridade() {
        return paciente.getPrioridade();
    }
    public String getHoraChegada() {
        return horaChegada;
    }
    public void setHoraChegada(String horaChegada) {
        this.horaChegada = horaChegada;
    }
    public String getHoraSaida() {
        return horaSaida;
    }
    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }
    public String getHoraAtendimentoInicio() {
        return horaAtendimentoInicio;
    }
    public void setHoraAtendimentoInicio(String horaAtendimentoInicio) {
        this.horaAtendimentoInicio = horaAtendimentoInicio;
    }
    public String getHoraAtendimentoFim() {
        return horaAtendimentoFim;
    }
    public void setHoraAtendimentoFim(String horaAtendimentoFim) {
        this.horaAtendimentoFim = horaAtendimentoFim;
    }
}
