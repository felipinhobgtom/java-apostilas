package exerciciosFaccat;
import java.util.Scanner;

public class OrdemCrescenteNumeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero.");
		int num = sc.nextInt();
		
		System.out.println("Digite o segundo n�mero.");
		int num2 = sc.nextInt();
		
		if(num < num2) {
			System.out.println("A ordem dos n�meros crescentes �: " + num + ", " + num2);
		}else {
			System.out.println("A ordem dos n�meros crescentes �: " + num2 + ", " + num);
		}
		
		sc.close();
	}
}
