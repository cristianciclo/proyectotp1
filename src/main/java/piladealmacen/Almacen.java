package piladealmacen;

import java.io.*;

public class Almacen {
	
	private Pale[] pales = new Pale[1000];
	private int posicion;
	private double totalPeso;
	private int totalCajas;
	private BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	public void menu() throws NumberFormatException, IOException{
		int opcion = 0;
		do{
		
			System.out.println("----------MENU----------");
			System.out.println("1. Add pale.");
			System.out.println("2. Quitar pale.");
			System.out.println("3. Mostrar totales.");
			System.out.println("4. Mostrar pales");
			System.out.println("0. Salir");
			
			opcion = Integer.parseInt(teclado.readLine());
			
			switch (opcion) {
			case 1:
				addPale();
				break;
			case 2:
				quitarPale();
				break;
			case 3:
				mostrarTotales();
				break;
			case 4:
				recorrer();
				break;
			case 0:
				System.out.println("Adios!!!!!");
				break;
				
	
			default:
				System.out.println("Por favor, elija un numero de 1 al 4.");
				break;
		}
		
		}while(opcion!=0);
	}

	private boolean existePale(String codigo){
		
		for (int i = 0; i < posicion; i++) {
			if(codigo.equals(pales[i].getCodigo())){
				return true;
			}
		}
		return false;
	}
	
	private void mostrarTotales() throws NumberFormatException, IOException {
		System.out.println("Hay "+posicion+" palés en la pila, y hay un total de cajas de "+this.totalCajas+" y su peso total es "+this.totalPeso);
		
	}

	private void quitarPale() {
		pales[posicion]=null;
		posicion--;
		this.totalCajas-=pales[posicion].get
		this.totalPeso+=a.getPeso();
		System.out.println("Se ha quitado un palé.");
	}

	private void addPale() throws NumberFormatException, IOException {
		System.out.println("Introduzca el codigo del pale que desea introducir:");
		String codigo = teclado.readLine();
		Pale a = new Pale();
		
		if(existePale(codigo)){
			System.out.println("El pale ya existe");
			return;
		}
		
		a.PedirPale(codigo);
		pales[posicion]=a;
		posicion++;
		this.totalCajas+=a.getNumeroCajas();
		this.totalPeso+=a.getPeso();
		}
	

	public void recorrer(){
		for (int i = 0; i < posicion; i++) {
			System.out.println(pales[i]);
		}
	}
	
	
}
