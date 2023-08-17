import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Matriz {
    public static void main(String[] args) {
        // 1. Faça um programa que peça ao usuário um valor inteiro impar entre 3 e 11 (inclusive 3 e 11, valide esta entrada), após isto crie uma matriz quadrada (inteiros) do tamanho do número informado pelo usuário. Permita que o usuário informe os valores para cada uma das posições da matriz. Após isto calcula e mostre as seguintes informações sobre a matriz: 
        //     • Soma dos elementos; 
        //     • Média dos elementos (duas casas decimais); 
        //     • Maior valor; 
        //     • Menor valor; 
        //     • Contador de pares; 
        //     • Contador de ímpares; 
        //     • Soma da diagonal principal; 
        //     • Soma da diagonal secundária; 
        //     • Mostrar a Matriz (formatada); 
        //     Permitir gravar e ler estes dados de um arquivo. 
        Scanner input = new Scanner(System.in);
		int impar = 0;
        String conteudo = "";
		while(impar%2==0 || impar<3 || impar>11){
			System.out.print("Escreva valor inteiro impar entre 3 e 11: ");
			impar = input.nextInt();
        }
        int[][] matriz = new int[impar][impar];
        for (int i=0; i<impar; i++){
            for (int j=0; j<impar; j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j]=input.nextInt();
            }
        }
        int soma = 0;
        int n = 0;
        int nPar = 0;
        int nImpar = 0;
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        int maior = matriz[0][0];
        int menor = matriz[0][0];
        for (int i=0; i<impar; i++){
            conteudo += "[";
            for (int j=0; j<impar; j++){
                soma+=matriz[i][j];
                n++;
                if (matriz[i][j]%2==0){
                    nPar++;
                } else{
                    nImpar++;
                }

                if (i==j){
                    somaDiagonalPrincipal+=matriz[i][j];
                }

                if (i==(impar-j-1)){
                    somaDiagonalSecundaria+=matriz[i][j];
                }

                if(matriz[i][j]>maior){
                    maior=matriz[i][j];
                }

                if(matriz[i][j]<menor){
                    menor=matriz[i][j];
                }

                System.out.print(matriz[i][j]+" ");
                conteudo+=matriz[i][j]+(j<impar-1 ? ", " : "");
            }
            System.out.println();
            conteudo+="],\n";
        }
        System.out.println("Soma dos elementos: "+soma);
        conteudo+="\nSoma dos elementos: "+soma;
        System.out.println("Média dos elementos (duas casas decimais): "+(soma/n));
        conteudo+="\nMédia dos elementos (duas casas decimais): "+(soma/n);
        System.out.println("Maior valor: "+maior);
        conteudo+="\nMaior valor: "+maior;
        System.out.println("Menor valor: "+menor);
        conteudo+="\nMenor valor: "+menor;
        System.out.println("Contador de pares: "+nPar);
        conteudo+="\nContador de pares: "+nPar;
        System.out.println("Contador de Ímpares: "+nImpar);
        conteudo+="\nContador de Ímpares: "+nImpar;
        System.out.println("Soma da diagonal principal: "+somaDiagonalPrincipal);
        conteudo+="\nSoma da diagonal principal: "+somaDiagonalPrincipal;
        System.out.println("Soma da diagonal secundária: "+somaDiagonalSecundaria);
        conteudo+="\nSoma da diagonal secundária: "+somaDiagonalSecundaria;

        String caminhoArquivo = "matriz01.html";
        try {
            FileWriter writer = new FileWriter(caminhoArquivo);
            writer.write(conteudo);
            writer.close();
            System.out.println("Deu boa");
        }catch(IOException e){
            System.out.println("Deu ruim: "+e.getMessage());
        }
        input.close();
    }
}
