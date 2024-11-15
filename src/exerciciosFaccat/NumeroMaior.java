package exerciciosFaccat;
import java.util.Scanner;

public class NumeroMaior {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número.");
		int num = sc.nextInt();
		
		System.out.println("Digite o segundo número.");
		int num2 = sc.nextInt();
		
		if(num2 < num) {
			System.out.printf("O maior número é o %d.", num);
		}else {
			System.out.printf("O maior número é o %d.", num2);
		}
		sc.close();
	}
}
