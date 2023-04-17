package Variaveis;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		
		float salario,abono,novosalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu salário atual: ");
		salario = leia.nextFloat();
		System.out.println("Digite seu abono: ");
		abono = leia.nextFloat();
		
		novosalario = salario+abono;
				
		System.out.printf("\nSeu novo salário: %.2f",novosalario);
		
	}

}
