import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class Loteria {
    public static void main(String[] args) {
        // Criar uma loteria com 6 números de 1 a 60. Solicitar ao usuário quantas cartelas deseja preencher criar uma matriz deste tamanho para armazenar os valores que serão criados aleatoriamente. No final analisar cada uma das cartelas e mostrar ao lado do números (ordenados em ordem crescente e não repetidos dentro da mesma cartela) o total de acertos. 
        //     Permitir gravar e ler estes dados de um arquivo.
        Scanner input = new Scanner(System.in);
        int nCartelas = 0;
        while(nCartelas<=0) {
            System.out.print("Quantas cartelas você deseja preencher: ");
            nCartelas = input.nextInt();
        }
        int[][] cartelas = new int[6][nCartelas];
        Random random = new Random();
        int[] loteria = new int[6];
        for (int i=0; i<6; i++) {
            loteria[i] = 0;
            while(loteria[i]<=0 || loteria[i]>60)
        }
        input.close();
    }
}
