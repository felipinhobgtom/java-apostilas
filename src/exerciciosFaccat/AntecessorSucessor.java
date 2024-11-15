package exerciciosFaccat;
import java.util.Scanner;

public class AntecessorSucessor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		
		int sucessor = numero + 1;
		int antecessor = numero - 1;
		
		System.out.println("O sucessor de " + numero+" é: " + sucessor);
		System.out.println("O antecessor de " + numero+" é: " + antecessor);
		sc.close();
	}
}
