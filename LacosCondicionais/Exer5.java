package LacosCondicionais;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		
		int op, qnt;
		
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Escolha uma das opções dos produtos:");
		System.out.println("1 - Cachorro Quente R$10,00");
		System.out.println("2 - X-Salada R$15,00");
		System.out.println("3 - X-Bacon R$18,00");
		System.out.println("4 - Bauru R$12,00");
		System.out.println("5 - Refrigerante R$8,00");
		System.out.println("6 - Suco de Laranja R$13,00");
		op = read.nextInt();
		
		switch (op) {
		case 1: 
			System.out.println("Quantos você quer? ");
			qnt = read.nextInt();
			System.out.println("Valor total: R$"+10*qnt+",00");
			break;
		case 2: 
			System.out.println("Quantos você quer? ");
			qnt = read.nextInt();
			System.out.println("Valor total: R$"+15*qnt+",00");
			break;
		case 3: 
			System.out.println("Quantos você quer? ");
			qnt = read.nextInt();
			System.out.println("Valor total: R$"+18*qnt+",00");
			break;
		case 4: 
			System.out.println("Quantos você quer? ");
			qnt = read.nextInt();
			System.out.println("Valor total: R$"+12*qnt+",00");
			break;
		case 5: 
			System.out.println("Quantos você quer? ");
			qnt = read.nextInt();
			System.out.println("Valor total: R$"+8*qnt+",00");
			break;
		case 6: 
			System.out.println("Quantos você quer? ");
			qnt = read.nextInt();
			System.out.println("Valor total: R$"+13*qnt+",00");
			break;
		default: 
			System.out.println("Opção Inválida.");
		}
		
		

	}

}
