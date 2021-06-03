package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Test;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.dubluri.StubStudent;

public class TestGrupaWithStub {

	@Test
	public void testPromovabilitateLimitaSuperioara() {
		Grupa grupa=new Grupa(1045);
		IStudent student=new StubStudent();
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}
	
}
