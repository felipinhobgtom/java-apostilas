package exerciciosFaccat;
import java.util.Scanner;

public class PositivoOuNegativo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero.");
		int num = sc.nextInt();
		
		if(num < 0) {
			System.out.printf("O n�mero %d � negativo.", num);
		}else {
			System.out.printf("O n�mero %d � positivo.", num);
		}
		
		sc.close();
	}
}