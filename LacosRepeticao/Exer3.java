package LacosRepeticao;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade=0, contmenor=0, contmaior=0;
		
		
		while (idade >=0) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			if (idade >=1 && idade<21) {
				contmenor++;
			} else if (idade>=50) {
				contmaior++;
			}
			
		}
		
		System.out.println("Total de pessoas menores de 21 anos: "+contmenor);
		System.out.println("Total de pessoas maiores de 50 anos: "+contmaior);
				
	}
}