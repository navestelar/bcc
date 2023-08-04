import java.util.Scanner;

public class PiramidePintada {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Altura: ");
		float h = input.nextFloat();
		
		System.out.print("Apótema da base: ");
		float ab = input.nextFloat();
		
		System.out.println("+------------------+");
		System.out.println("|Tipo 1: R$127,90  |");
		System.out.println("|Tipo 2: R$258,98  |");
		System.out.println("|Tipo 3: R$344,34  |");
		System.out.println("+------------------+");
		System.out.print("Tipo de tinta: ");
		int tipoDeTinta = input.nextInt();
		
		double al = Math.sqrt((h*h)+(ab*ab));
		//base do triângulo = 2 apótema da base 
		//altura do triangulo = apótema lateral 
		//area do triangulo = (2*ab)*al/2
		double areaTriangulo = ab*al;
		//area da base = lado*lado
		//lado = apotema da base
		double areaBase = 4*ab*ab;
		double areaTotal = 4*areaTriangulo+areaBase;
		double litros = areaTotal/4.76;
		int latas = (int) Math.ceil(litros/18);
		float[] precosLata = {127.90f, 258.98f, 344.34f};
		float precoTotal = latas*precosLata[tipoDeTinta-1];
		double volume = areaBase*h/3;
		
		System.out.println("ab: "+ab);
		System.out.println("h: "+h);
		System.out.println("al: "+al);
		System.out.println("Área Triângulo: "+areaTriangulo);
		System.out.println("Área Base: "+areaBase);
		System.out.println("Área Total: "+areaTotal);
		System.out.println("Tipo de Tinta: "+tipoDeTinta);
		System.out.println("Litros: "+litros);
		System.out.println("Latas: "+latas);
		System.out.println("Preço: "+precoTotal);
		System.out.println("Volume: "+volume);
		
		input.close();
	}

}
