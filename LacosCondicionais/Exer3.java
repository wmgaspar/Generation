package LacosCondicionais;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean doacao;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Qual seu nome? ");
		nome = read.next();
		
		System.out.println("Quantos anos você tem? ");
		idade = read.nextInt();
		
		
		if (idade>=18 && idade<=69) {
			System.out.println("Primeira doação? (true or false)");
			doacao = read.nextBoolean();
			if (idade>=60 && idade<=69 && doacao) {
				System.out.println(nome+" não está apto para doar sangue!");
			} else {
				System.out.println(nome+" está apto para doar sangue!");
			}
		} else {
			System.out.println(nome+" não está apto para doar sangue!");
		}
		
		
	}

}
