import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int TAM = 5;
		int[] arr = new int[TAM];
		int soma = 0;
		float media = 0;
		for (int i=0; i<TAM; i++) {
			System.out.print("Informe o número: ");
			arr[i] = input.nextInt();
		}
		
		for (int i=0; i<TAM; i++) {
			System.out.println(arr[i]);
			soma += arr[i];
		}
		media = (float)soma/(float)TAM;
		System.out.println("Soma: "+soma);
		System.out.println("Média: "+media);
		input.close();
	}

}
