package br.com.teste;

public class PessoaJuridica extends Pessoa implements IPessoa{
	
	private String cnpj;

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	@Override
	public void mostrar() {
		System.out.println("PESSOA JURÍDICA: ");
		System.out.println("Nome: " + super.getNome());
		System.out.println("Telefone: " + super.getTelefone());
		System.out.println("CNPJ: " + this.getCnpj());
		System.out.println();
	}
	
}
