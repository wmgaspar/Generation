package Variaveis;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {

		float n1,n2,n3,n4,diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite primeiro numero: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite segundo numero: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite terceiro numero: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite quarto numero: ");
		n4 = leia.nextFloat();
		
		//diferenca = (n1*n2)-(n3*n4); 
		
		System.out.printf("\nDiferenca do produto entre o n1 e n2 pelo produto entre o n3 e o n4: %.2f",(n1*n2)-(n3*n4));
		
	
	}

}
