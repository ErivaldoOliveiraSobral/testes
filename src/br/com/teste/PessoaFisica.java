package br.com.teste;

public class PessoaFisica extends Pessoa implements IPessoa{
	
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void mostrar() {
		System.out.println("PESSOA FÍSICA: ");
		System.out.println("Nome: " + super.getNome());
		System.out.println("Telefone: " + super.getTelefone());
		System.out.println("CPF: " + this.getCpf());
		System.out.println();
	}

	
}
