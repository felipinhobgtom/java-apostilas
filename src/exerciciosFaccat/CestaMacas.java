package exerciciosFaccat;

import java.util.Scanner;

public class CestaMacas {
	public static void main(String[] args) {
		// maca menor que uma duzia: R$1,30
		// R$1,00 pelo menos uma duzia

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantas maçãs deseja comprar.");
		int qntd = sc.nextInt();

		float preco = 0;
		float orcamento = 0;

		if (qntd < 12) {
			preco = 1.30f;
		} else {
			preco = 1f;
		}
		orcamento = qntd * preco;
		System.out.printf("Suas %d maçãs custam R$%.2f", qntd, orcamento);
		sc.close();
	}
}
