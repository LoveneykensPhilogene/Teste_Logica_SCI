package exercicios.teste_5;

import java.util.Scanner;

public class Campionato {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int qtd = 0;
		int i = 0;
		double nota = 0.0;
		double notaTotal=0.0;
		double media = 0.0;
		double todasNotas[] = new double[6];
		double maiorNota = todasNotas[0];
		double menorNota = todasNotas.length;

		try (s) {
			while (qtd < 6) {
				for (qtd = 0; qtd < 6; qtd++) {
					i++;
					System.out.println("Juiz nº" + i + ", " + "infomar a nota do jogador : ");

					nota = Double.parseDouble(s.nextLine());
					if (nota <= 10) {
						todasNotas[qtd] = nota;
					} else {
						System.out.print("Inserir uma nota inferio ou igual a 10 .\n");
						qtd += 5;

					}

				}
				for (int x = 0; x < todasNotas.length; x++) {
					if (todasNotas[x] > maiorNota) {
						maiorNota = todasNotas[x];

					} else {

					}
					if (todasNotas[x] < menorNota) {
						menorNota = todasNotas[x];
					} else {

					}
					notaTotal+=todasNotas[x];
				 media=(notaTotal-(maiorNota+menorNota))/4;

				}
				
				

				System.out.print("A nota final do atleta é : "+media);

			}
			

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
