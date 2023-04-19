package Collection;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exer2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		List<Integer> listaNum = new ArrayList<Integer>();
		int procura;
		
		for (int x=0;x<10;x++) {
			System.out.println("Digite um numero: ");
			int num = leia.nextInt();
			listaNum.add(num);
		}
		
		System.out.println("\nDigite um numero para procurar a posição: ");
		procura = leia.nextInt();
		
		if (listaNum.contains(procura)) {
			
				System.out.println("O número "+procura+" está localizado na posição: "+listaNum.indexOf(procura));
		} else {
				System.out.println("O número "+procura+" não foi encontrado! ");
		}
	
	}

}
