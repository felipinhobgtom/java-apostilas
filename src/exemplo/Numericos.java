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

		System.out.println("Digite o primeiro número:");
		int numero = sc.nextInt();

		System.out.println("Digite o segundo número:");
		int numero2 = sc.nextInt();

		int soma = numero + numero2;
		int subtracao = numero - numero2;
		int produto = numero * numero2;
		float quociente = numero / numero2;

		System.out.println("A soma desses números é: " + soma);
		System.out.println("A subtração dos números é: " + subtracao);
		System.out.println("O produto desses números é: " + produto);
		System.out.println("O quociente desses números é: " + quociente);
	}
}
