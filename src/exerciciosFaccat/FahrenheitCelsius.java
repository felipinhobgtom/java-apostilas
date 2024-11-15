package exerciciosFaccat;

import java.util.Scanner;

public class FahrenheitCelsius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma temperatura em graus fahrenheit.");
		float fahrenheit = sc.nextFloat();
		
		float celsius = (5*fahrenheit-160)/9;
		System.out.printf("Sua temperatura em celsius é %.2f ºC", celsius);
		
		sc.close();
	}
}