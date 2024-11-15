package exerciciosFaccat;

import java.util.Scanner;

public class NovoSalario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu salário");
		float salario = sc.nextFloat();

		System.out.println("Digite o percentual de reajuste");
		float percentual = sc.nextFloat();

		float reajuste = salario + (salario * (percentual / 100));
		System.out.printf("O seu reajuste salarial é R$%.2f", reajuste);

		sc.close();
	}
}
