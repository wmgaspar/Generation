package POO;

public class Testa_Exer1 {

	public static void main(String[] args) {
		
		PessoaFisica Joao = new PessoaFisica ("Joao","354.043.670-75","rua abc", "23","jo@email.com",92);
		PessoaJuridica Maria = new PessoaJuridica ("Maria","296.635.030-09","Av asd","35","mari@email.com","cozinheira");
		
		Joao.imprimir();
		
		Maria.imprimir();

	}

}
