package datos;


public class Pedido implements Comparable<Pedido>{
	
	private int codigoPedido;
	private String nombre;
	private String direccion;
	private int importe;
	private Fecha fecha;
	private int telefono;
	private boolean realizado;
	
	/*
	 * 0 - Código
	 * 1 - Nombre
	 * 2 - Dirección
	 * 3 - Importe
	 * 4 - Fecha
	 * 5 - Teléfono
	 */
	private int ordenacion;
	
	/*
	 * False - Ordena de menor a mayor
	 * True - Ordena de mayor a menor
	 */
	private boolean ordenacionInversa = false;
	
	// Para generar el código de los pedidos
	private static int genCodigo = 0;
	
	public Pedido(String nombre, String direccion, int importe, Fecha fecha, int telefono) {
		this.codigoPedido = genCodigo++; //No sé si funcionará
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
	
	public boolean getRealizado() {
		return realizado;
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
	
	public void setRealizado(boolean realizado) {
		this.realizado = realizado;
	}
	

	//ToString temporal
	public String toString() {
		return (codigoPedido +" " + nombre + " " + direccion + " " + importe +
				" " + fecha + " " + telefono);
	}

	@Override
	public int compareTo(Pedido p) {
		switch(ordenacion) {
		case 0:
			if (codigoPedido == p.codigoPedido)
				return 0;
			if (codigoPedido > p.codigoPedido)
				return 1;
			else return -1;
		case 1:
			if (nombre.equals(p.nombre))
				return 0;
			if (nombre.compareTo(p.nombre) == 1)
				return 1;
			else return -1;
		case 2:
			if (nombre.equals(p.direccion))
				return 0;
			if (nombre.compareTo(p.direccion) == 1)
				return 1;
			else return -1;
		case 3:
			if (importe == p.importe)
				return 0;
			if (importe > p.importe)
				return 1;
			else return -1;
		case 4:
			//Fecha
			if (nombre.equals(p.nombre))
				return 0;
			if (nombre.compareTo(p.nombre) == 1)
				return 1;
			else return -1;
		case 5:
			if (telefono == p.telefono)
				return 0;
			if (telefono > p.telefono)
				return 1;
			else return -1;
		default:
			System.out.println("Esto no debe ejecutarse nunca.");
			return 2;
		}
	}
	
}