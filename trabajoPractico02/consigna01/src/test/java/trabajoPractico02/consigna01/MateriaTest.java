package trabajoPractico02.consigna01;

import static org.junit.Assert.*;

import org.junit.Test;

public class MateriaTest {

	@Test
	public void testMateria() {
		Materia m = new Materia();
		String codigoMateria = m.getCodigoMateria();
		String nombre = m.getNombre();
		
		assertSame("50", codigoMateria);
		assertSame("Pepe", nombre);
	}

	@Test
	public void testToString() {
		
		Materia m=new Materia("10","fisica");
		String expected="codigoMateria=10, nombre=fisica";
		assertEquals(expected,m.toString());
		
	}

}
