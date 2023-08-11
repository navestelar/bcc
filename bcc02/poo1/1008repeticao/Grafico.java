import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Grafico {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		String caminhoArquivo = "grafico.html";
		
		int quantidadeDeNumeros = 0;
		do {
			System.out.print("Quantidade de números: ");
			quantidadeDeNumeros = input.nextInt();			
		}while(quantidadeDeNumeros<1);
		
		System.out.print("Valor mínimo: ");
		int valorMinimo = input.nextInt();
		
		int valorMaximo = valorMinimo;
		do {
			System.out.print("Valor máximo: ");
			valorMaximo = input.nextInt();
		}while(valorMaximo<=valorMinimo);
		
		int[] arr = new int[quantidadeDeNumeros];
		for (int i=0; i<quantidadeDeNumeros; i++) {
			do {
				arr[i] = random.nextInt(valorMaximo)+1;
			}while(arr[i]<valorMinimo);
		}
		
		String conteudoM ="";
		
		for (int i=0; i<quantidadeDeNumeros; i++) {
			conteudoM += "["+i+", "+arr[i]+"],\r\n";
		}
		
		String conteudo = "  <html>\r\n"
				+ "  <head>\r\n"
				+ "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n"
				+ "    <script type=\"text/javascript\">\r\n"
				+ "      google.charts.load('current', {'packages':['corechart']});\r\n"
				+ "      google.charts.setOnLoadCallback(drawChart);\r\n"
				+ "\r\n"
				+ "      function drawChart() {\r\n"
				+ "        var data = google.visualization.arrayToDataTable([\r\n"
				+ "          ['Contador', 'Números'],\r\n"
				+conteudoM
				+ "        ]);\r\n"
				+ "\r\n"
				+ "        var options = {\r\n"
				+ "          title: 'Company Performance',\r\n"
				+ "          curveType: 'function',\r\n"
				+ "          legend: { position: 'bottom' }\r\n"
				+ "        };\r\n"
				+ "\r\n"
				+ "        var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));\r\n"
				+ "\r\n"
				+ "        chart.draw(data, options);\r\n"
				+ "      }\r\n"
				+ "    </script>\r\n"
				+ "  </head>\r\n"
				+ "  <body>\r\n"
				+ "    <div id=\"curve_chart\" style=\"width: 900px; height: 500px\"></div>\r\n"
				+ "  </body>\r\n"
				+ "</html>\r\n"
				+ "";
		
		try {
			FileWriter writer = new FileWriter(caminhoArquivo);
			writer.write(conteudo);
			writer.close();
			System.out.println("Deu boa");
		}catch (IOException e) {
			System.out.println("Deu ruim: "+e.getMessage());
		}
		input.close();
	}
}
