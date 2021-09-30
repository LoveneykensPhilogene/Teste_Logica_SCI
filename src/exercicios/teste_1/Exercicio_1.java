package exercicios.teste_1;

import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String arg[]) {

		double n1Double, n2Double, n3Double, maiorValor;

		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Digite o primeiro numero");

			String n1 = s.nextLine();
			n1Double = Double.parseDouble(n1);

			System.out.println("Digite o segundo numero");

			String n2 = s.nextLine();
			n2Double = Double.parseDouble(n2);

			System.out.println("Digite o terceiro numero");

			String n3 = s.nextLine();
			n3Double = Double.parseDouble(n3);
			
			if ((n1Double > n2Double) && (n1Double > n3Double)) {
				maiorValor = n1Double;
			} else if ((n2Double > n1Double) && (n2Double > n3Double)) {
				maiorValor = n2Double;
			} else {
				maiorValor = n3Double;
			}

			System.out.println("Maior número : " + maiorValor);

		} catch (NumberFormatException e) {
		
			e.printStackTrace();
		}

		
	}

}
