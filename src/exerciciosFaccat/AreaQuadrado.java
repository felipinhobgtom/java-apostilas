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
			System.out.println("A �rea do seu quadrado �: " + areaQuadrado);
		} else {
			System.out.println("Isso � um retangulo.");
		}
		sc.close();
	}
}