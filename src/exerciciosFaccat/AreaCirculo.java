package exerciciosFaccat;

import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o raio do c�rculo");
		float raio = sc.nextInt();

		double area = Math.PI * (raio * raio);
		System.out.printf("O raio do c�rculo �: %.2f", area);
		sc.close();
	}
}