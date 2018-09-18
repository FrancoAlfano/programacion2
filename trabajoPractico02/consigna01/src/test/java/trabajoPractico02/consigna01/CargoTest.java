package trabajoPractico02.consigna01;

import static org.junit.Assert.*;

import org.junit.Test;

public class CargoTest {

	@Test
	public void testCargo() {
		Cargo c = new Cargo();
		String nom = c.getNombre();
		double basico = c.getBasico();
		
		assertEquals("jefesito", nom);
		assertEquals(12, basico, 0);
	}

	@Test
	public void testCargoStringDouble() {
		Cargo car = new Cargo("subjefesito", 12);
		String expected=car.toString();
		String actual = "nombre=" + car.getNombre() + ", basico=" + car.getBasico();
	
		assertEquals(expected, actual);
	}

	@Test
	public void testToString() {
		Cargo c2 = new Cargo();
		String actual = c2.toString();
		assertEquals("nombre=jefesito, basico=12.0", actual);
	}

}
