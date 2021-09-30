package exercicios.teste_2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Conversao {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int entrada=0;
		double cotacao=2.40;
		BigDecimal valorConvertido;
		double valorInserido;
		System.out.println("Sistema aceita valor desse formato [0.00]"+"\n");
		System.out.println("====INSTRUÇÃO===="+"\n"+"De real para dola [ 1 ] "+"de dolar para real [ 2 ]");
		try(s){
			System.out.println("Iniciar a conversão : ");
			entrada=Integer.parseInt(s.nextLine());
			
			System.out.println("Digite o valor : ");
			valorInserido=Double.parseDouble(s.nextLine());
			
			if((entrada>0) && (entrada==1)) {
				valorConvertido=new BigDecimal(valorInserido/cotacao);
				System.out.println("Valor em real : "+"R$ "+valorInserido +"\n"+"Valor em dolar : "+"$ "+ valorConvertido );
			}else if((entrada>1) && (entrada==2)) {
				valorConvertido=new BigDecimal(valorInserido*cotacao);
				System.out.println("Valor em dolar : "+"$ "+valorInserido +"\n"+"Valor em real : "+"R$ "+ valorConvertido );
			}else {
				System.out.println("Segue a instrucão .....");
			}
			
			
		}catch(Exception e) {
			System.out.print(e);
		}

	}

}
