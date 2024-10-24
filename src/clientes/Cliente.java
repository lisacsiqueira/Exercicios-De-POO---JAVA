package clientes;

public class Cliente {
	
	protected String id;
	protected String nome;
	protected String data;
	protected String pedido;
	
	
	public Cliente(String id, String nome, String data, String pedido) {
		this.id = id;
		this.nome = nome;
		this.data = data;
		this.pedido = pedido;
	}
	
	public void acessarSistema() {
		System.out.println("Id: " + id + 
				"\nNome: " + nome);
	}
	
	public void fazerPedido() {
		System.out.println("Cliente: " + nome +
				"\nPedido: " + pedido + 
				"\nData: "+ data);
		
	}

}
