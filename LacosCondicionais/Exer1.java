package LacosCondicionais;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite algum número: ");
		n1 = leia.nextInt();
		System.out.println("Digite outro número: ");
		n2 = leia.nextInt();
		System.out.println("Digite mais outro número: ");
		n3 = leia.nextInt();
		
		if ((n1+n2)>n3) {
		System.out.println(n1+"+"+n2+" é maior que "+n3);
		}
		else if ((n1+n2)<n3) {
			System.out.println(n1+"+"+n2+" é menor que "+n3);
			}
		else if ((n1+n2)==n3) {
		System.out.println(n1+"+"+n2+" é igual a "+n3);
			}
	}
}
