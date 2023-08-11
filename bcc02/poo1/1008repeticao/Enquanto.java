import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 1;
		int qtd = -1;
		int soma = 0;
		float media = 0;
		while(n!=0) {
			System.out.print("Digite 0 para parar ou qualquer outro número inteiro para continuar: ");
			n = input.nextInt();
			qtd++;
			soma += n;
		}
		media = (float)soma/(float)qtd;
		System.out.println("Quantidade de valores: "+qtd);
		System.out.println("Soma: "+soma);
		System.out.println("Média: "+media);
		input.close();
	}

}
