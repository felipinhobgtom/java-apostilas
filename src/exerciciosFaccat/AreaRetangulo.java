package exerciciosFaccat;

import java.util.Scanner;

public class AreaRetangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a altura do ret�ngulo");
		float altura = sc.nextFloat();

		System.out.println("Digite a largura do ret�ngulo");
		float largura = sc.nextFloat();

		if (altura == largura) {
			System.out.println("Isso � um quadrado.");
		}else {
			float areaRetangulo = altura*largura;
			System.out.println(areaRetangulo);
		}
		sc.close();
	}
}
