package exerciciosFaccat;
import java.util.Scanner;

public class MaiorMenorQue10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero.");
		int num = sc.nextInt();
		
		if(num == 10) {
			System.out.println("Esse n�mero � o 10.");
		} else if(num < 10) {
			System.out.printf("O n�mero %d � menor que 10.", num);
		} else {
			System.out.printf("O n�mero %d � maior que 10.", num);
		}
		sc.close();
	}
}
