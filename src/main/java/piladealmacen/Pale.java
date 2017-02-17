package piladealmacen;

public class Pale {

	private String codigo;
	private double peso;
	private int numeroCajas;
	
	public Pale(String codigo, double peso, int numeroCajas) {
		
		this.codigo = codigo;
		this.peso = peso;
		this.numeroCajas = numeroCajas;
	}

	public Pale() {
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getNumeroCajas() {
		return numeroCajas;
	}

	public void setNumeroCajas(int numeroCajas) {
		this.numeroCajas = numeroCajas;
	}

	//Método equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pale other = (Pale) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (numeroCajas != other.numeroCajas)
			return false;
		if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
			return false;
		return true;
	}
	
	public void PedirPale(){
		
		this.codigo = PedirDatos.leerCadena("Introduzca el código del palé.");
		this.peso = PedirDatos.leerDecimal("Introduzca el peso del palé.");
		this.numeroCajas = PedirDatos.leerEntero("Introduzca el número de cajas que contiene el palé.");
		
	}
	
	public void PedirPale(String codigo){
		
		this.codigo = codigo;
		this.peso = PedirDatos.leerDecimal("Introduzca el peso del palé.");
		this.numeroCajas = PedirDatos.leerEntero("Introduzca el número de cajas que contiene el palé.");
		
	}
	
	
	
}
