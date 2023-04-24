package Queue_Stack;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Exer1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<>();
		int op;
		
		do {
			System.out.println("""
					***************************************
					1 - Adicionar um novo Cliente na fila
					2 - Listar todos os Clientes na fila
					3 - Retirar uma pessoa da fila
					0 - Sair
					***************************************					
					""");
			op = leia.nextInt();
			
			switch(op) {
			case (1): 
				leia.nextLine();
				System.out.println("\nDigite o nome do cliente: \n");
				String nome = leia.nextLine();
				fila.add(nome);
				break;
			
			case (2): 
				leia.nextLine();
				if (fila.size()==0) {
					System.out.println("Fila vazia.\n");
					}else {
						System.out.println("\nFila de clientes: "+fila+"\n");
					}
				break;
				
			case (3): 
				leia.nextLine();
				if (fila.size()==0) {
					System.out.println("Fila vazia.\n");
					}else {
						fila.poll();
						System.out.println("\nCliente foi chamado! \nNomes na fila: "+fila+"\n");
					}				
				break;
			
			case (0): 
				System.out.println("\nMuito obrigado por utilizar do nosso programa... Volte Sempre!!!");
			break;
			
			default:
				System.out.println("\nOpção inválida!!!\n");	
							
			} 
		}while (op!= 0); 		
				
			
		
	}

}
