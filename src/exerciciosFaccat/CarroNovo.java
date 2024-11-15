package exerciciosFaccat;

import java.util.Scanner;

public class CarroNovo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o custo do carro");
		float custo = sc.nextFloat();
		
		float distribuidora = custo*28/100;
		float imposto = custo*45/100;
		
		float finalPrice = custo+distribuidora+imposto;
		System.out.printf("O preço final do seu veículo é de R$%.2f",finalPrice);
		
		sc.close();
	}
}
