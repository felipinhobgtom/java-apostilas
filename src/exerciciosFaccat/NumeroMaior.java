package exerciciosFaccat;
import java.util.Scanner;

public class NumeroMaior {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero.");
		int num = sc.nextInt();
		
		System.out.println("Digite o segundo n�mero.");
		int num2 = sc.nextInt();
		
		if(num2 < num) {
			System.out.printf("O maior n�mero � o %d.", num);
		}else {
			System.out.printf("O maior n�mero � o %d.", num2);
		}
		sc.close();
	}
}
