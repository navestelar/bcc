import java.util.Scanner;

    public class Atividade03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // //ex01
        // System.out.print("Escreva o primeiro número: ");
        // float n1 = input.nextFloat();
        // System.out.print("Escreva o segundo número: ");
        // float n2 = input.nextFloat();
        // if (n1>n2) {
        //     System.out.print(n1);
        // }else {
        //     System.out.print(n2);
        // }
        // System.out.println(" é o maior.");

        // //ex02
        // System.out.print("Escreva um número: ");
        // float n = input.nextFloat();
        // System.out.print("O número "+n+" é ");
        // if (n>0){
        //     System.out.println("positivo.");
        // }else if (n<0){
        // System.out.println("negativo.");
        // }else {
        // System.out.println("nulo.");
        // }
        
        // //ex03
        // System.out.print("Escreva M ou F: ");
        // String letra = input.nextLine();
		// if (letra.toUpperCase().equals("F")){
		// 	System.out.println("Feminino");
		// }else if (letra.toUpperCase().equals("M")){
		// 	System.out.println("Masculino");
        // }

        // //ex04
        // System.out.print("Ano: ");
        // int year = input.nextInt();
        // if (year%4==0){
        //     System.out.println("Bissexto");
        // }else {
        //     System.out.println("Não bissexto");
        // }

        // input.close();

        // //ex05
        // System.out.print("Letra: ");
        // String letter = input.nextLine();
        // if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
        //     System.out.println("Vogal");
        // }else {
        //     System.out.println("Consoante");
        // }

        // //ex13
        // System.out.print("valor da sua hora: ");
        // float valorHora = input.nextFloat();
        // System.out.print("Quantidade de horas trabalhadas no mês: ");
        // int horasTrabalhadas = input.nextInt();
        // float salarioBruto = valorHora*horasTrabalhadas;
        // int descontoSalario = salarioBruto>2500 ? 20 : salarioBruto>1500 ? 10 : salarioBruto>900 ? 5 : 0; 
        // double porcentagemDesconto = (descontoSalario/100)+0.05+0.1;
        // System.out.println("IR (5%): "+salarioBruto*0.05);
        // System.out.println("INSS (10%): "+salarioBruto*0.1);
        // System.out.println("FGTS (11%): "+salarioBruto*0.11);
        // System.out.println("Total de descontos : "+salarioBruto*porcentagemDesconto);
        // System.out.println("Salário Liquido : "+salarioBruto*(1-porcentagemDesconto));

        // //ex14
        // int n = input.nextInt();
		// String semana = n==1 ? "“Sul”" : n==2 ? "“Norte”" : n==3 ? "“Leste”" : n==4 ? "“Oeste”" : n==5 || n==6 ? "“Nordeste”" : n==7 || n==8 ? "“Centro-oeste”" : "“Importado”";
		// System.out.println(semana);


        // int reais = 0;
        // while(reais<5 || reais>600){
        //     System.out.print("“Quantos reais você quer sacar?”");
        //     reais = input.nextInt();
        // }		
        // int nota100 = (reais - (reais%100))/100;
        // int reaisAux = reais%100;
        // int nota50 = (reaisAux - (reaisAux%50))/50;
        // reaisAux = reaisAux%50; 
        // int nota10 = (reaisAux - (reaisAux%10))/10;
        // reaisAux = reaisAux%10;
        // int nota5 = (reaisAux - (reaisAux%5))/5;
        // reaisAux = reaisAux%5;
        // int nota1 = (reaisAux - (reaisAux%1))/1;
        // reaisAux = reaisAux%1;
        // String mensagem = nota100>0 ? nota100+"” notas de 100, ”" : "";
        // mensagem += nota50>0 ? nota50+"” notas de 50, ”" : "";
        // mensagem += nota10>0 ? nota10+"” notas de 10, ”" : "";
        // mensagem += nota5>0 ? nota5+"” notas de 5, ”" : "";
        // mensagem += nota1>0 ? nota1+"nota de 1" : "";
        // System.out.println(mensagem);

        // System.out.print("“Digite um número: “");
		// float numero = input.nextFloat();
		// System.out.println(numero==Math.floor(numero) ? "Inteiro" : "Decimal");
        input.close();
    }
}
