package version1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GestionWrapper {
	
	private Wrapper primero;
	private Wrapper ultimo;
	private int numeroPedidos;

	// Para generar el código de los pedidos
	private static int genCodigo;
	
	public GestionWrapper() {
		primero = null;
		ultimo = null;
		numeroPedidos =  0;
		genCodigo = 0;
	}
	
	public boolean save(String filename) {
		try {
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeInt(numeroPedidos);
			oos.writeObject(primero);
			oos.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean load (String filename) {
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			numeroPedidos = ois.readInt();
			primero = (Wrapper)ois.readObject();
			setUltimo();
			ois.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public int getElem() {
		return numeroPedidos;
	}
	
	private void setUltimo() {
		if (primero != null) {
			Wrapper aux = primero;
			while (aux.getSiguiente() != null)
				aux = aux.getSiguiente();
			ultimo = aux;
		}
	}
	
	public void insertarP(Pedido o) {
		Wrapper w = new Wrapper(o);
		if (primero == null) 
			ultimo = w;
		else 
			primero.setAnterior(w);

		w.setAnterior(null);
		w.setSiguiente(primero);
		primero = w;
		numeroPedidos = numeroPedidos + 1;
	}

	public void insertarF(Pedido o) {
		Wrapper w = new Wrapper(o);
		
		if (primero == null) 
			primero = w;
		else
			ultimo.setSiguiente(w);
		
		w.setSiguiente(null);
		w.setAnterior(ultimo);
		ultimo = w;
		numeroPedidos = numeroPedidos + 1;
	}
	
	public Pedido get(int pos) {
		if (pos >= numeroPedidos || pos < 0)
			return null;
		else {
			Wrapper aux = primero;
			for (int i=0; i<pos; i++)
				aux = aux.getSiguiente();
			return aux.getPedido();
		}
	}

	public boolean set(int pos, Pedido pedido) {
		if (pos < numeroPedidos && pos >= 0) {
			Wrapper aux = primero;
			for (int i=0; i<pos; i++)
				aux = aux.getSiguiente();
			aux.setPedido(pedido);
			return true;
		} else
			return false;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<numeroPedidos; i++) 
			sb.append(get(i).toString() + "\n");

		return sb.toString();
	}
}
