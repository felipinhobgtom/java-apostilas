package exerciciosFaccat;

import java.util.Scanner;

public class RevendedoraCarros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um salário fixo.");
		float salario = sc.nextFloat();
		
		System.out.println("Digite o valor por carro vendido");
		float valorUnidade = sc.nextFloat();
		
		System.out.println("Digite a quantidade de carros vendidos.");
		int carros = sc.nextInt();
		
		System.out.println("Digite o valor total de vendas");
		float totalVendas = sc.nextFloat();
		
		float comissaoCarro = valorUnidade * carros;
		float comissaoVenda = totalVendas * 0.05f;
		
		float salarioFinal = salario + comissaoCarro + comissaoVenda;
		
		System.out.printf("O seu salário final é de: R$%.2f", salarioFinal);
		
		sc.close();
	}
}