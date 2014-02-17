package version1;

public class Pedido {
	
	private int codigoPedido;
	private String nombre;
	private String direccion;
	private int importe;
	private Fecha fecha;
	private int telefono;
	
	// Para generar el c�digo de los pedidos
	private static int genCodigo = 0;
	
	public Pedido(String nombre, String direccion, int importe, Fecha fecha, int telefono) {
		this.codigoPedido = genCodigo++; //No s� si funcionar�
		this.nombre = nombre;
		this.direccion = direccion;
		this.importe = importe;
		this.fecha = fecha;
		this.telefono = telefono;
	}

	public int getCodigoPedido() {
		return codigoPedido;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public int getImporte() {
		return importe;
	}
	
	public Fecha getFecha() {
		return fecha;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
}