/**
 * JavaDoc
 * @author Felipao
 * 
 */

package exemplo;

import java.util.Scanner;

public class Numericos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero:");
		int numero = sc.nextInt();

		System.out.println("Digite o segundo n�mero:");
		int numero2 = sc.nextInt();

		int soma = numero + numero2;
		int subtracao = numero - numero2;
		int produto = numero * numero2;
		float quociente = numero / numero2;

		System.out.println("A soma desses n�meros �: " + soma);
		System.out.println("A subtra��o dos n�meros �: " + subtracao);
		System.out.println("O produto desses n�meros �: " + produto);
		System.out.println("O quociente desses n�meros �: " + quociente);
	}
}
