package exerciciosFaccat;
import java.util.Scanner;

public class DiasVividos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos anos voc� tem");
		int idade = sc.nextInt();
		
		System.out.println("Quantos h� quantos meses se passou do seu �ltimo anivers�rio");
		int meses = sc.nextInt();
		
		System.out.println("Digite h� quantos dias foi o seu m�svers�rio");
		int dias = sc.nextInt();
			
		int IdadeEmDias = (idade*365)+(meses*30)+dias;
		System.out.printf("Voc� viveu %d dias!",IdadeEmDias);
		sc.close();
	}
}
