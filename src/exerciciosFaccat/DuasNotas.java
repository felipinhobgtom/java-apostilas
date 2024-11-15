package exerciciosFaccat;
import java.util.Scanner;

public class DuasNotas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno.");
		float nota1 = sc.nextFloat();
		
		System.out.println("Digite a segunda nota do aluno.");
		float nota2 = sc.nextFloat();
		
		float media = (nota1+nota2)/2;
		
		if(media < 6) {
			System.out.printf("A nota do seu aluno foi %.2f, infelizmente reprovou.", media);
		}else {
			System.out.printf("A nota do seu aluno foi %.2f, ele passou de ano!.", media);
		}
		sc.close();
	}
}