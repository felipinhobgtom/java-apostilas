package exerciciosManzano.enquanto;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero para fazer a tabuada at� o 10.");
		int num = sc.nextInt();

		System.out.printf("Tabuada do %d %n %n", num);

		int cont = 1;
		while (cont <= 10) {
			System.out.println(num + "x" + cont + " = " + num * cont);
			cont++;
		}
		
		sc.close();
	}
}
