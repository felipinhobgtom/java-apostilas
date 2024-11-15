package exerciciosFaccat;
import java.util.Scanner;

public class PodeVotar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano atual.");
		int atual = sc.nextInt();
		
		System.out.println("Digite o ano de seu nascimento.");
		int nascimento = sc.nextInt();
		
		int idade = atual-nascimento;
		
		if(idade<16) {
			System.out.printf("Não pode votar, possui %d anos.", idade);
		}else if(idade<18){
			System.out.printf("Voto facultativo, possui %d anos.", idade);
		}else {
			System.out.printf("Voto obrigatório, possui %d anos.", idade);
		}
		sc.close();
	}
}
