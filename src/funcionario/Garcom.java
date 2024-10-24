package funcionario;

public class Garcom  extends Funcionario{
	
	protected String pedidoAnotado;

	public Garcom(String id, String nome, String acesso) {
		super(id, nome, acesso);
		}
	
	public void anotarPedido(String pedido) {
		System.out.println(pedido + "\n\no Pedido foi cadastrado");

	}
	
}
