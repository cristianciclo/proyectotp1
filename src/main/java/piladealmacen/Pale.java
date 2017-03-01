package piladealmacen;

import java.io.*;

public class Pale {

	private String codigo;
	private double peso;
	private int numeroCajas;
	private BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
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
	
	public void PedirPale() throws NumberFormatException, IOException{
		System.out.println("Introduzca el código del pale.");
		this.codigo = teclado.readLine();
		System.out.println("Introduzca el peso del pale. ");
		this.peso = Double.parseDouble(teclado.readLine());
		System.out.println("Introduzca el número de cajas del pale.");
		this.numeroCajas = Integer.parseInt(teclado.readLine());
		
	}
	
	public void PedirPale(String codigo) throws NumberFormatException, IOException{
		this.codigo = codigo;
		System.out.println("Introduzca el peso del pale. ");
		this.peso = Double.parseDouble(teclado.readLine());
		System.out.println("Introduzca el número de cajas del pale.");
		this.numeroCajas = Integer.parseInt(teclado.readLine());
		
	}

	@Override
	public String toString() {
		return "Pale [codigo=" + codigo + ", peso=" + peso + ", numeroCajas=" + numeroCajas+"]";
	}
	
	
	
}
