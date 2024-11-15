package exerciciosFaccat;

import java.util.Scanner;

public class AreaQuadrado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a altura do quadrado");
		int altura = sc.nextInt();

		System.out.println("Digite a largura do quadrado");
		int largura = sc.nextInt();

		if (largura == altura) {
			int areaQuadrado = largura * altura;
			System.out.println("A área do seu quadrado é: " + areaQuadrado);
		} else {
			System.out.println("Isso é um retangulo.");
		}
		sc.close();
	}
}