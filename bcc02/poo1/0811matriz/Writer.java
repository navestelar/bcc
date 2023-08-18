import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String caminhoArquivo = "index.html";
        String conteudo = "";
        int[] matriz = new int[5];
        for (int i=0; i<3; i++){
            matriz[i] = random.nextInt(100)+1;
            conteudo+=matriz[i]+" ";
        }
        try {
            FileWriter writer = new FileWriter(caminhoArquivo);
            writer.write(conteudo);
            writer.close();
            System.out.println("Deu boa");
        }catch (IOException e) {
            System.out.println("Erro: "+e.getMessage());
        }
        input.close();
    }
}