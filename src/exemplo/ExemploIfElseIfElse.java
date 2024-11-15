package exemplo;

import java.util.Scanner;

public class ExemploIfElseIfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a sua idade");
		int num = sc.nextInt();

		if (num < 16) {
			System.out.println("Você não pode votar.");
		} else if (num < 18) {
			System.out.println("O voto é facultativo");
		} else {
			System.out.println("O voto é obrigatório");
		}

	}
}
