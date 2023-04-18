package Arrays;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int [] vetor = new int [10];
		int impar, par, soma = 0;
		float media;
		
		for (int x=0;x<10;x++) {
			System.out.println("Digite um numero: ");
			vetor[x] = leia.nextInt();
			
		}
		
		System.out.println("Elementos ímpares: ");
		
		for (int x=0;x<10;x++) {
			if (vetor[x]%2==1) {
				impar = vetor[x];
				System.out.println(impar);
			}
		}
		
		System.out.println("Elementos pares: ");
		
		for (int x=0;x<10;x++) {
			if (vetor[x]%2==0) {
				par = vetor[x];
				System.out.println(par);
			}
		}
				
		for (int x=0;x<10;x++) {
				soma += vetor[x];
			}
		System.out.println("Soma:"+soma);
		
		media = (float)soma/10;
		System.out.println("Media: "+media);
		
	}
	
	
	}

