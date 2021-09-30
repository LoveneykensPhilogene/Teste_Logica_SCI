package exercicios.teste_3;

import java.util.Scanner;

public class FolhaPagamento {

	public static void main(String[] args) {
		
		double salario_hora, salario_bruto;
		double valorHoraExtra = 0.0;
		int hora_extra = 0;
		int numero_horas;
		final double porcentagem = 0.5;
		final int horasNormais = 220;
		
		Scanner s = new Scanner(System.in);

		try (s) {

			System.out.println("Informar quantidade que ganha por hora : ");
			salario_hora = Double.parseDouble(s.nextLine());

			System.out.println("Informar numero de horas : ");
			numero_horas = Integer.parseInt(s.nextLine());

			if (numero_horas <= horasNormais) {
				salario_bruto = salario_hora * numero_horas;
			} else {
				hora_extra = numero_horas - horasNormais;
				valorHoraExtra = (salario_hora * hora_extra) * porcentagem;
				salario_bruto = (salario_hora * horasNormais) + valorHoraExtra;

			}
			System.out.println("O funcionário receberá um valor de : " + "R$ " + salario_bruto);
			

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
