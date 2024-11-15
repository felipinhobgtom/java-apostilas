package exerciciosFaccat;

import java.util.Scanner;

public class AreaHexagono {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho do lado do hexágono");
		int lado = sc.nextInt();

		double area = 6 * (Math.pow(lado, 2) * Math.sqrt(3)) / 4;
		System.out.printf("A área do hexágono é: %.2f", area);
		sc.close();
	}
}