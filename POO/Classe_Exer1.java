package POO;

public class Classe_Exer1 {
		// atributos
		private String nomeCliente;
		private String cpf;
		private String endereco;
		private String idade;
		private String email;
		
		public Classe_Exer1(String nomeCliente, String cpf, String endereco, String idade, String email) {
			super();
			this.nomeCliente = nomeCliente;
			this.cpf = cpf;
			this.endereco = endereco;
			this.idade = idade;
			this.email = email;
		}

		public String getNomeCliente() {
			return nomeCliente;
		}

		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getIdade() {
			return idade;
		}

		public void setIdade(String idade) {
			this.idade = idade;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		public void visualizarCliente () {
			System.out.printf("""
					
		Nome: %s
		CPF: %s
		Endereço: %s 
		Idade: %s
		E-mail: %s
					
			""",nomeCliente,cpf,endereco,idade,email);
		}
		
		
}
