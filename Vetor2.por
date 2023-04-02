programa
{
	
	funcao inicio()
	{
		inteiro vetor [10] = {2,5,1,3,4,9,7,8,10,6} 
		inteiro soma = 0
		escreva("Posições do vetor: ")
		para (inteiro i=0;i<10;i++) {
			escreva(vetor[i],"/")
		}
		escreva ("\nElementos nos índices ímpares: ")
		para (inteiro i=0;i<10;i++) {
			se (vetor[i]%2==1) {
				escreva (vetor[i],"/")
			}
		}

		escreva ("\nElementos pares: ")
		para (inteiro i=0;i<10;i++) {
			se (vetor[i]%2==0) {
				escreva (vetor[i],"/")
			}
			
		}
		
		escreva ("\nSoma: ")
		para (inteiro i=0;i<10;i++) {
			soma += vetor[i]
			}
		escreva (soma)
		
		escreva ("\nMédia: ",soma/10)
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 606; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */