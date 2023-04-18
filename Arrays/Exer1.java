package Arrays;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int [] numeros = {2,5,1,3,4,9,7,8,10,6,};
		int num, posicao = -1, x;
		
		System.out.println("Digite um numero para procurar a posição: ");
		num = leia.nextInt();
		
		for (x=0;x<10;x++) {
			if (num == numeros [x]) {
				posicao = x;
				System.out.println("O número "+num+" está localizado na posição: "+posicao);
			} 
		}
		if (posicao!=x) {
			System.out.println("O número "+num+" não foi encontrado! ");
		}

	}

}
