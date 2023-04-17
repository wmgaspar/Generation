package LacosCondicionais;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		
			
		String tipo1,tipo2,tipo3;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Escolha primeiro tipo:");
		tipo1 = read.nextLine();
		System.out.println("Escolha segundo tipo:");
		tipo2 = read.nextLine();
		System.out.println("Escolha terceiro tipo:");
		tipo3 = read.nextLine();
		
		if (tipo1.equalsIgnoreCase("vertebrado")) {
			if (tipo2.equalsIgnoreCase("ave")) {
				if (tipo3.equalsIgnoreCase("carnivoro")) {
					System.out.println("É uma águia");
				} else {
					System.out.println("É uma pomba");
				}
			} else {
				if (tipo3.equalsIgnoreCase("onivoro")) {
					System.out.println("É um homem");
				} else {
					System.out.println("É uma vaca");
				}
			}
		} else {
			if (tipo2.equalsIgnoreCase("inseto")) {
				if (tipo3.equalsIgnoreCase("hematofago")) {
					System.out.println("É uma pulga");
				} else {
					System.out.println("É uma lagarta");
				}
			} else {
				if (tipo3.equalsIgnoreCase("hematofago")) {
					System.out.println("É uma sanguessuga");
				} else {
					System.out.println("É uma minhoca");
				}
			}
		}
		
	}

}
