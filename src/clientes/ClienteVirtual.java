package clientes;

public class ClienteVirtual extends Cliente{
	
	protected String endereco;

	public ClienteVirtual(String id, String nome, String data, String pedido) {
		super(id, nome, data, pedido);
		this.endereco = endereco;
		
	}
	
	@Override
	public void fazerPedido() {
		System.out.println(
				"nome: " + nome +
				"\npedido: " + pedido + 
				"\nendereco: " + endereco + 
				"\ndata: " + data
				);
	}
	
	
	
	

}
