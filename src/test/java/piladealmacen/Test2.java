package piladealmacen;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test2 {
	Almacen a = new Almacen();
	@Test
	public void testExistePale() {
		
	Pale p=new Pale("0002",20.0,20);
	assertEquals(a.existePale("0002"),false);
	System.out.println("El método funciona correctamente.");
			 
	}
	

}
