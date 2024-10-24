package funcionario;

public class Gerente extends Funcionario {

	public Gerente(String id, String nome, String acesso) {
		super(id, nome, acesso);
	}
	
	public void cadastrarGarcom(String nome) {
		System.out.println(nome + " foi cadastrado");
		
	}
	
	
	
	

}
