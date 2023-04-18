package Arrays;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		int linha, coluna, diagonalP, diagonalS, somaDP, somaDS;
		
		for (linha=0;linha<3;linha++) {
			for (coluna=0;coluna<matriz.length;coluna++) {
				if (linha==0 && coluna==0) {
					System.out.println(matriz[linha][coluna]);
				} else if (linha==1 && coluna==1) {
					System.out.println(matriz[linha][coluna]);
				}
						
			}
		} 
		
		
	}

}
