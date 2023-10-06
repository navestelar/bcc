import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListaAtendimento {
    private ArrayList<Atendimento> listaAtendimento = new ArrayList<Atendimento>();
    
    public boolean adicionarAtendimeto(Atendimento atendimento) {
        listaAtendimento.add(atendimento);
        ordenarPorPrioridade();
        return true;
    }

    private void ordenarPorPrioridade() {
        Collections.sort(listaAtendimento, new Comparator<Atendimento>() {
            public int compare(Atendimento a1, Atendimento a2) {
                return Integer.compare(a1.getPrioridade(), a2.getPrioridade());
            }
        });
    }

    public ArrayList<Atendimento> getListaAtendimento() {
        return listaAtendimento;
    }
}
