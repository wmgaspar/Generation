package LacosCondicionais;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		
		int n;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		n=read.nextInt();
		
		if (n%2==0 && n>0) {
			System.out.println(n+" é par e positivo");
		}
		else if (n%2==1 && n>0) {
			System.out.println(n+" é impar e positivo");
		}	
		else if (n%2==0 && n<0) {
			System.out.println(n+" é par e negativo");
		}
		else if (n%2==1 && n<0) {
			System.out.println(n+" é impar e negativo");
		}
		else if (n==0) {
			System.out.println(n+" é par e neutro");
		}
	}

}
