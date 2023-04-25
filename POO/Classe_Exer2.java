package POO;

import java.text.NumberFormat;

public class Classe_Exer2 {

	private String nome;
	private String cpf;
	private int idade;
	private double salario;
	private String cargo;
	
	public Classe_Exer2(String nome, String cpf, int idade, double salario, String cargo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.salario = salario;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	public String formatarSalario () {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);		
		return formatoMoeda;
	}
	
	public void imprimir() {
		System.out.println();
		System.out.println("Nome = "+nome);
		System.out.println("Cpf = "+cpf);
		System.out.println("Idade = "+idade);
		System.out.println("Salario = "+this.formatarSalario());
		System.out.println("Cargo = "+cargo);
				
				
	}
	
	
	
	
}
