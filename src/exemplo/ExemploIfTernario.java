package exemplo;

import java.util.Scanner;

public class ExemploIfTernario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o seu salario");
		float salario = sc.nextFloat();

		String mensagem = salario > 1412 ? "Sal�rio maior que o sal�rio m�nimo" : "Sal�rio menor que o sal�rio m�nimo"; // simplesmente
																														// o																									
		System.out.print(mensagem);																						// if
		sc.close();																										// tenariioasdsdjkjmx
	}
}