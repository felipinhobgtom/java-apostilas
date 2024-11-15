package exemplo;

import java.util.Scanner;

public class ExemploIfTernário {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o seu salario");
		float salario = sc.nextFloat();

		String mensagem = salario > 1412 ? "Salário maior que o salário mínimo" : "Salário menor que o salário mínimo"; // simplesmente
																														// o																									
		System.out.print(mensagem);																						// if
		sc.close();																										// tenariioasdsdjkjmx
	}
}