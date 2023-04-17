package LacosRepeticao;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2,x=0;
		
		System.out.println("Escreva um número: ");
		n1 =leia.nextInt();
		
		System.out.println("Escreva outro número: ");
		n2=leia.nextInt();
		
		if (n1>=n2) {
			System.out.println("Intervalo inválido!");
		} 
		for (x=n1;x<=n2;x++) {
			if (x%3==0 && x%5==0)
				System.out.println(x+" é múltiplo de 3 e 5");
		}
				
	}
}