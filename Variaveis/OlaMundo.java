package Variaveis;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		String nome = "Charles";
		int idade = 25;
		double altura = 1.72;
		float nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nome do participante: "+nome);
		System.out.println("Idade do participante: "+idade+" anos");
		System.out.println("Altura do participante: "+altura);
		
		System.out.println("Entre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Entre com a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Entre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3)/3;
		
		System.out.println("\nA média das notas: "+media);
		System.out.printf("\nMédia das notas: %.2f",media);
		
	}

}
