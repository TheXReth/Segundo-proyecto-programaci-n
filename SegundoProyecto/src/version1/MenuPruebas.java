package version1;

import java.util.Scanner;

public class MenuPruebas {

	public static Scanner teclado;
	final static String filename = "prueba.dat";
	
	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		String menu = "\n1.- Insertar principio (Pelicula)";
		menu = menu + "\n2.- Insertar final (Pelicula)";
		menu = menu + "\n3.- Ver elemento";
		menu = menu + "\n4.- Sustituir";
		menu = menu + "\n5.- Imprimir lista";
		menu = menu + "\n6.- Insertar principio (Triangulo)";
		menu = menu + "\n7.- Insertar final (Triangulo)";
		menu = menu + "\n8.- Grabar (binario)";
		menu = menu + "\n9.- Cargar (binario)";
		menu = menu + "\n10.- Grabar (texto)";
		menu = menu + "\n11.- Cargar (texto)";
		menu = menu + "\n0.- Salir";
		GestionWrapper gw = new GestionWrapper();
		int opt;
		Pedido nuevo;
		do {
			System.out.println(menu);
			System.out.print("Elija una opción: ");
			opt = Integer.parseInt(teclado.nextLine());
			int pos;
			switch(opt) {
			case 1: nuevo = RecogerDatos();
			gw.insertarP(nuevo);
			break;
			case 2: nuevo = RecogerDatos();
			gw.insertarF(nuevo);
			break;
			case 3: System.out.print("Número: ");
			pos = Integer.parseInt(teclado.nextLine());
			System.out.println(gw.get(pos));
			break;
			case 4: System.out.print("Número: ");
			pos = Integer.parseInt(teclado.nextLine());
			nuevo = RecogerDatos();
			gw.set(pos, nuevo);
			break;
			case 5: System.out.println(gw);
			break;
			case 6: nuevo = RecogerDatos();
			gw.insertarP(nuevo);
			break;
			case 7: nuevo = RecogerDatos();
			gw.insertarF(nuevo);
			break; 
			case 8: gw.save(filename);
			break;
			case 9: gw.load(filename);
			break;
			}
		} while(opt != 0);
		teclado.close();
	}

	private static Pedido RecogerDatos() {
		System.out.print("Nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Direccion: ");
		String direccion = teclado.nextLine();
		System.out.print("Importe: ");
		int importe = Integer.parseInt(teclado.nextLine());
		Fecha fecha = new Fecha(2014, 2, 17);
		System.out.print("Teléfono: ");
		int telefono = Integer.parseInt(teclado.nextLine());
	
		Pedido pedido = new Pedido(nombre, direccion, importe, fecha, telefono);
	
		return pedido;
	}

}
