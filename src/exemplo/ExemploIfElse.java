package exemplo;
import java.util.Scanner;

public class ExemploIfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		
		int numero = sc.nextInt();
		
		if(numero<18) {
			System.out.println("O n�mero digitado � menor que 18");
		}else {
			System.out.println("O n�mero digitado � maior que 18");
		}
	}
}