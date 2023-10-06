import java.util.Scanner;

public class Prioridade {
    private int nivelDePrioridade;

    public void fazerPerguntas(Perguntas perguntas) {
        Scanner input = new Scanner(System.in);
        nivelDePrioridade = 0;
        for (int i=0; i<5; i++) {
            System.out.println(perguntas.getPerguntas()[i]);
            String resposta = input.nextLine();
            if(resposta.equals("sim")) {
                nivelDePrioridade++;
            }
        }
        input.close();
    }

    public int getNivelDePrioridade() {
        return nivelDePrioridade;
    }
}
