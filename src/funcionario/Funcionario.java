package funcionario;

public class Funcionario {
	protected String id;
	protected String nome;
	protected String acesso;
	
	
	public Funcionario(String id, String nome, String acesso) {
		this.id = id;
		this.nome = nome;
		this.acesso = acesso;
	}
	
	public void acessarSistema() {
		System.out.println("Id: " + id + 
				"\nNome: " + nome + 
				"\nPermissão de Acesso:" + acesso);
	}
	
	
	

}
