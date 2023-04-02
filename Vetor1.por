programa
{
	funcao inicio()
	{
		inteiro vetor[10] = {3,8,1,2,4,9,5,10,7,6},x,y

		escreva ("Posição do vetor: ")		
		para (inteiro i=0;i<10;i++)
	 	{
	 		escreva(vetor[i],"/")
		}
		
		para (y=0;y<9;y++) {
			para (x=0;x<9;x++) {
				se (vetor[x] < vetor[x+1]) {
					inteiro aux = vetor[x]
					vetor[x] = vetor[x+1]
					vetor[x+1] = aux
				}
	 		}
		}
	
		escreva("\nVetor decrescente:")
		para (inteiro i=0;i<10;i++){
			escreva(vetor[i],"/")
			}
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 186; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */