package Variaveis;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		
		float nota1,nota2,nota3,nota4,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.println("Quarta nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
				
		System.out.printf("\nMédia das notas: %.2f",media);
		
		
	}

}
