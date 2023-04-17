package Variaveis;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		
		float salarioBruto,noturno,extras,descontos,salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.print("Digite o adicional noturno: ");
		noturno = leia.nextFloat();
		
		System.out.print("Digite os valores das horas extras: ");
		extras = leia.nextFloat();
		
		System.out.print("Digite os descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto+noturno+extras*5-descontos;
		
		System.out.printf("\nSeu salário liquido: %.2f",salarioLiquido);

		
	}

}
