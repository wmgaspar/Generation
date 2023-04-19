package Collection;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		List<String> cores = new ArrayList<String>();
		
		String cor;
		
		
		for (int x=0;x<5;x++) {
			System.out.println("Digite uma cor: ");
			cor = leia.nextLine();
			cores.add(cor);
			}
		
		System.out.println("\nCores digitadas: ");
		
		for (int i=0;i<cores.size();i++) {
		System.out.println(cores.get(i));
		}
		
		System.out.println("\nCores ordenadas: ");
		
		Collections.sort(cores);
		System.out.println(cores);
		
		

	}

}
