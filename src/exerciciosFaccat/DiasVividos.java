package exerciciosFaccat;
import java.util.Scanner;

public class DiasVividos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos anos você tem");
		int idade = sc.nextInt();
		
		System.out.println("Quantos há quantos meses se passou do seu último aniversário");
		int meses = sc.nextInt();
		
		System.out.println("Digite há quantos dias foi o seu mêsversário");
		int dias = sc.nextInt();
			
		int IdadeEmDias = (idade*365)+(meses*30)+dias;
		System.out.printf("Você viveu %d dias!",IdadeEmDias);
		sc.close();
	}
}
