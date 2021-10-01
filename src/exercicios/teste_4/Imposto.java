package exercicios.teste_4;

import java.util.Scanner;

public class Imposto {

	public static void main(String[] args) {
		double imposto, salario;

		Scanner s = new Scanner(System.in);

		try (s) {
			System.out.println("Informar teu salário :");
			salario = Double.parseDouble(s.nextLine());
			if (salario >= 0 && salario <= 499.99) {
				imposto = (5 * salario) / 100;
			} else if (salario >= 500 && salario <= 999.99) {
				imposto = (10 * salario) / 100;
			} else if (salario >= 1000 && salario <= 1499.99) {
				imposto = (15 * salario) / 100;
			} else if (salario >= 1500 && salario <= 1999.99) {
				imposto = (20 * salario) / 100;
			} else {
				imposto = (25 * salario) / 100;
			}
			System.out.println("Valor do imposto : " + "R$" + imposto);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
