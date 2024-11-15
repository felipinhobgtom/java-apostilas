package exerciciosFaccat;
import java.util.Scanner;

public class MaiorMenorQue10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número.");
		int num = sc.nextInt();
		
		if(num == 10) {
			System.out.println("Esse número é o 10.");
		} else if(num < 10) {
			System.out.printf("O número %d é menor que 10.", num);
		} else {
			System.out.printf("O número %d é maior que 10.", num);
		}
		sc.close();
	}
}
