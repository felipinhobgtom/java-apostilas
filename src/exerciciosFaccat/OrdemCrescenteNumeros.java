package exerciciosFaccat;
import java.util.Scanner;

public class OrdemCrescenteNumeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número.");
		int num = sc.nextInt();
		
		System.out.println("Digite o segundo número.");
		int num2 = sc.nextInt();
		
		if(num < num2) {
			System.out.println("A ordem dos números crescentes é: " + num + ", " + num2);
		}else {
			System.out.println("A ordem dos números crescentes é: " + num2 + ", " + num);
		}
		
		sc.close();
	}
}
