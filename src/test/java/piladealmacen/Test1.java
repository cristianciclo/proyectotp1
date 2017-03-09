package piladealmacen;

import static org.junit.Assert.*;
import org.junit.Test;
import piladealmacen.*;
public class Test1 {

	@Test
	public void test() {
		Pale p = new Pale("0001",20.5,10);
		assertEquals(p.getCodigo(),"0001");
		assertEquals(p.getPeso,20.5);
		assertEquals(p.getNumeroCajas(),10);
		system.out.println("palé construido con éxito.");
	}

}
