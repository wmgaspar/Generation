package Arrays;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		int linha, coluna, diagonalP, diagonalS, somaDP = 0, somaDS;
		
		for (linha=0;linha<3;linha++) {
			for (coluna=0;coluna<matriz.length;coluna++) {
				if (linha==coluna) {
					somaDP += matriz[linha][coluna];
					
				} 
						
			}
		} 
		
		
	}

}
