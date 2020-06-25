import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//exemplos1();
		//exemplos2();
		exemplos3();
		
	}

	private static void exemplos1() {
		System.out.println("Olá mundo");
		
		char valorChar;
		int valorInt;
		double valorDouble;
		String valorString = "exemplo";
		byte valorByte = 78;
		double valorDecimal = 12.3456;
		
		System.out.println(valorDecimal);		//exibe valor sem formatar casas decimais nem separador de decimais
		System.out.printf("%.2f%n", valorDecimal);	//formata com 2 casas decimais, altera separador para padrao da maquina e inclui quebra de linha
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n", valorDecimal);	//formata com 4 casas decimais, altera separador para padrao americano e inclui quebra de linha
		
		System.out.println("Concatenando " + valorDecimal + " valores");		//concatenacao simples
		System.out.printf("Concatenando %.2f valores %d com %s printf\n", valorDecimal, valorByte, valorString);	//concatenacao com printf
		
		
		
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra:");
		valorString = sc.next();
		System.out.println("Valor digitado = " + valorString);
		
		System.out.println("Digite um inteiro:");
		valorInt = sc.nextInt();
		System.out.println("Valor digitado = " + valorInt);
		
		System.out.println("Digite um valor decimal:");
		valorDouble = sc.nextDouble();
		System.out.println("Valor digitado = " + valorDouble);
		
		System.out.println("Digite uma letra:");
		valorChar = sc.next().charAt(0);
		System.out.println("Valor digitado = " + valorChar);
		
		sc.nextLine();		//para consumir a quebra de linha pendente na entrada padrao (devido as leituras anteriores)
		
		System.out.println("Digite uma frase:");
		valorString = sc.nextLine();
		System.out.println("Valor digitado = " + valorString);
		
		sc.close();
	}
	
	private static void exemplos2() {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println(A);
		System.out.println(B);
	}
	
	private static void exemplos3() {
		
	}
}
