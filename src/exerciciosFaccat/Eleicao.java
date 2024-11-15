package exerciciosFaccat;

import java.util.Scanner;

public class Eleicao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de votos do candidato X");
		float validos = sc.nextFloat();

		System.out.println("Digite quantos votos foram nulos");
		float nulos = sc.nextFloat();

		System.out.println("Digite quantos votos foram brancos");
		float brancos = sc.nextFloat();

		float total = validos + nulos + brancos;

		System.out.printf("O percentual de votos validos é: %.2f %s %n", (validos / total) * 100, '%');
		System.out.printf("O percentual de votos nulos é: %.2f %s %n", (nulos / total) * 100, '%');
		System.out.printf("O percentual de votos brancos é: %.2f %s %n", (brancos / total) * 100, '%');
		sc.close();
	}
}