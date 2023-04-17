package LacosRepeticao;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1,resultado=0;
		
		
		do {
			System.out.println("Digite um numero: ");
			n1=leia.nextInt();
			
			if (n1>0) {
				resultado += n1;
			}
				
		} while(n1!=0);

		System.out.println("A soma dos números positivos é: "+resultado);
	}

}
