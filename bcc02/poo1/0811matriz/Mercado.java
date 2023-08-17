import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Mercado{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float[][] produtos = new float[5][5];
		String caminhoArquivo = "mercado.html";
		String conteudo = "";
		float[] somaProduto = {0,0,0,0,0};
        float[] somaPreco = {0,0,0,0,0};
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				produtos[i][j] = 0;
				while(produtos[i][j]<=0){
					System.out.print("Mercado "+(i+1)+" Produto "+(j+1)+": ");
					produtos[i][j] = input.nextFloat();
                }
                somaProduto[j] += produtos[i][j];
                somaPreco[i] += produtos[i][j];
            }
        }
        float mercadoMaisBarato = somaPreco[0];
        float mercadoMaisCaro = somaPreco[0];
        for(int i=0; i<5; i++){
            conteudo+="Mercado "+i+": \n";
            for(int j=0; j<5; j++){
                if(somaPreco[i]>mercadoMaisCaro){
                    mercadoMaisCaro=somaPreco[i];
                }
                if(somaPreco[i]<mercadoMaisBarato){
                    mercadoMaisBarato=somaPreco[i];
                }
                conteudo+="Produto "+j+": "+produtos[i][j]+"\n";
                if(i==4){
                    conteudo+="Média de preço produto "+j+" = "+(somaProduto[j]/5)+"\n";
                }
            }
            conteudo+="Soma de preço mercado "+i+" = "+somaPreco[i]+"\n";
        }
        conteudo+="valor total no supermercado mais barato: "+mercadoMaisBarato+"\n";
        conteudo+="valor total no supermercado mais caro: "+mercadoMaisCaro+"\n";
        try{
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
