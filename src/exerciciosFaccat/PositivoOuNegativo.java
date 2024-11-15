package exerciciosFaccat;
import java.util.Scanner;

public class PositivoOuNegativo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número.");
		int num = sc.nextInt();
		
		if(num < 0) {
			System.out.printf("O número %d é negativo.", num);
		}else {
			System.out.printf("O número %d é positivo.", num);
		}
		
		sc.close();
	}
}