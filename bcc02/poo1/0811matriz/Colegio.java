import java.util.Scanner;

public class Colegio {
    public static void main(String[] args) {
        // Utilizando a estrutura de matriz, faça um programa que para um colégio que tem N (deve ser informado no início do programa) alunos e estes são avaliados em duas provas. O programa deve permitir digitação do nome do aluno e das duas notas e após isto mostrar as seguintes informações: 
        //     • Nome e as duas Notas de cada aluno; 
        //     • A média de cada aluno; 
        //     • A maior e menor nota (nome do aluno junto); 
        //     • A maior e menor média (nome do aluno junto); 
        //     • A média geral da turma; 
        //     • O nome dos alunos acima e abaixo da Media Geral da Turma; 
        //     Permitir gravar e ler estes dados de um arquivo. 
        Scanner input = new Scanner(System.in);
        int n = 0;
        while(n<=0){
            System.out.print("Quantos alunos: ");
            n = input.nextInt();
        }
        String[] nome = new String[n];
        float[][] notas = new float[n][2];
        for (int i=0; i<n; i++) {
            System.out.print("Nome do aluno "+(i+1)+": ");
            nome[i] = input.nextLine();
            for(int j=0; j<2; j++) {
                notas[i][j] = 0;
                while (notas[i][j]==0 || notas[i][j]>10){
                    System.out.print("Nota "+(j+1)+" do aluno "+nome[i]+": ");
                    notas[i][j] = input.nextFloat();
                }
            }
        }
        
        input.close();
    } 
}
