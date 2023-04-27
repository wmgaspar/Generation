package POO;

public class PessoaFisica extends Classe_Exer1 {
	
	int peso;

	public PessoaFisica(String nomeCliente, String cpf, String endereco, String idade, String email, int peso) {
		super(nomeCliente, cpf, endereco, idade, email);
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void imprimir() {
		System.out.println("\nNome: "+getNomeCliente()+"\nCPF: "+getCpf()+"\nEndereço: "+getEndereco()+ 
				"\nIdade: "+getIdade()+"\nE-mail: "+getEmail()+"\nPeso: "+peso+"Kg");
	}
}
