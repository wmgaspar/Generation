package Queue_Stack;

import java.util.Scanner;
import java.util.Stack;


public class Exer2 {

	public static void main(String[] args) {
		
		Stack<String> pilhaLivros = new Stack<String>();
		
		Scanner leia = new Scanner(System.in);
		int op;
		
		do {
			System.out.println("""
					 *********************************************
					
					 1: Adicionar um novo livro na pilha
					 2: Listar todos os livros
					 3: Retirar um livro da pilha
					 0: Sair  
					 
					 *********************************************
					""");
			op = leia.nextInt();
			
			switch(op) {
			case (1): 
				leia.nextLine();
				System.out.println("\nDigite o nome do livro: \n");
				String nome = leia.nextLine();
				pilhaLivros.push(nome);
				break;
			
			case (2): 
				leia.nextLine();
				if (pilhaLivros.isEmpty()) {
					System.out.println("Pilha está vazia.\n");
					}else {
						System.out.println("\nPilha de livros: "+pilhaLivros+"\n");
					}
				break;
				
			case (3): 
				leia.nextLine();
				if (pilhaLivros.isEmpty()) {
					System.out.println("Pilha está vazia.\n");
					}else {
						pilhaLivros.pop();
						System.out.println("\nLivro retirado. \nNomes na fila: "+pilhaLivros+"\n");
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
