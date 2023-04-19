package Collection;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exer3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num =0;
		Set<Integer> listaNum = new HashSet<Integer>();
		/*
		listaNum.add(2);
		listaNum.add(5);
		listaNum.add(1);
		listaNum.add(3);
		listaNum.add(4);
		listaNum.add(9);
		listaNum.add(7);
		listaNum.add(8);
		listaNum.add(10);
		listaNum.add(6);*/
	
		
		for (int x = 0;x<10;x++) {
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
			listaNum.add(num);
		}
		
		Iterator<Integer> inumeros = listaNum.iterator();
		
		while(inumeros.hasNext()) {
			System.out.println(inumeros.next());
		}
	}

}
