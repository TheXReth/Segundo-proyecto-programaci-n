package version1;

public class Wrapper {

	private Wrapper siguiente;
	private Wrapper anterior;
	private Pedido pedido;
	
	public Wrapper(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public Wrapper getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Wrapper siguiente) {
		this.siguiente = siguiente;
	}
	public Wrapper getAnterior() {
		return anterior;
	}
	public void setAnterior(Wrapper anterior) {
		this.anterior = anterior;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
		
}