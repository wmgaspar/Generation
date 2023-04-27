package POO;

public class PessoaJuridica extends Classe_Exer1 {
	
	String profissao;

	public PessoaJuridica(String nomeCliente, String cpf, String endereco, String idade, String email,
			String profissao) {
		super(nomeCliente, cpf, endereco, idade, email);
		this.profissao = profissao;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public void imprimir() {
		System.out.println("\nNome: "+getNomeCliente()+"\nCPF: "+getCpf()+"\nEndereço: "+getEndereco()+ 
				"\nIdade: "+getIdade()+"\nE-mail: "+getEmail()+"\nProfissão: "+profissao);
	}

}
