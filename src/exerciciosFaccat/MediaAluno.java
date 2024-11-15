package exerciciosFaccat;
import java.util.Scanner;

public class MediaAluno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota.");
		float nota1 = sc.nextFloat();
		
		System.out.println("Digite a segunda nota.");
		float nota2 = sc.nextFloat();
		
		System.out.println("Digite a terceira nota.");
		float nota3 = sc.nextFloat();
		
		float media = (nota1*2 + nota2*3 + nota3*5)/10;
		System.out.printf("A média desse aluno é %.2f", media);
		sc.close();
	}
}
