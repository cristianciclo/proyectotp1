package piladealmacen;

public class Almacen {
	
	private Pale[] pales = new Pale[1000];
	private int posicion;
	private double totalPeso;
	private int totalCajas;
	
	public void menu(){
		int opcion = 0;
		do{
		
			System.out.println("----------MENÚ----------");
			System.out.println("1. Añadir palé.");
			System.out.println("2. Quitar palé.");
			System.out.println("3. Mostrar palé.");
			System.out.println("4. Mostrar totales.");
			System.out.println("0. Salir");
			
			opcion = PedirDatos.leerEntero("Elija una opción");
			
			switch (opcion) {
			case 1:
				addPale();
				break;
			case 2:
				quitarPale();
				break;
			case 3:
				mostrarPales();
				break;
			case 4:
				mostrarTotales();
				break;
			case 0:
				System.out.println("Adiós!!!!!");
				break;
				
	
			default:
				System.out.println("Por favor, elija un número de 1 al 4.");
				break;
		}
		
		}while(opcion!=0);
	}
	
	
	private void mostrarTotales() {
		System.out.println("El total de cajas es: "+totalCajas+", y el peso total es de: "+totalPeso+" kilos." );
		
	}


	private void quitarPale() {
		pales[posicion] = null;
		posicion--;
		
		System.out.println("Palé eliminado de la pila.");
	}

	private void addPale() {
		System.out.println("Introduzca los datos del palé que desea introducir:");
		Pale a = new Pale();
		a.PedirPale();
		
		for (int i = posicion-1; i >= 0; i--) {
			if(a.getCodigo().equals(pales[i])){
				System.out.println("Lo sentimos, pero el palé que intenta introducir ya se encuentra en la pila.");
				return;
			}
			pales[posicion]=a;
			posicion++;
			
		}
	}
	
	public void mostrarPales(){
		for (int i = 0; i < pales.length; i++) {
			System.out.println(pales[i]);
		}
	}
	
	
}
