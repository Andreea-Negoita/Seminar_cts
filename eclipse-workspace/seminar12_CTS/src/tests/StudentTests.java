package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametri() {
		String nume="Gigel";
		Student student=new Student(nume);
		
//		if(nume!=student.getNume()) {
//			fail("numele nu este acelasi");
//		}
		
		
		assertEquals("Nume neinitializat",nume, student.getNume());
		assertNotEquals("Spatiu pentru lista nealocat",student.getNote(), null);
	}
	
	@Test
	public void testConstructorFaraParametri() {
		Student student=new Student();
		
		assertNotNull("Nume neinitializat",student.getNume());
		assertNotNull("Spatiu pentru lista nealocat",student.getNote());
	}
	
	@Test
	public void testSetterNume() {
		String nume="Gigel";
		Student student=new Student();
		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testAdaugareNote() {
		Student student=new Student();
		int nota=9;
		student.adaugaNota(nota);
		
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testDimensiuneLista() {
		Student student=new Student();
		int nota=9;
		student.adaugaNota(nota);
		
		
		assertEquals(1, student.getNote().size());
	}

	
	@Test
	public void testCalculeazaMedie() {
		Student student=new Student();
		int nota1=10, nota2=6, nota3=7;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		float medie=(nota1+nota2+nota3)/3.0f;
		
		
		assertEquals(medie, student.calculeazaMedie(), 0.01);
	}
	

	@Test
	public void testCalculeazaMedieONota() {
		Student student=new Student();
		int nota1=10;
		student.adaugaNota(nota1);
		assertEquals(nota1, student.calculeazaMedie(), 0.01);
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testCalculeazaMedieNicioNota() {
		Student student=new Student();
		student.calculeazaMedie();
	}
	
	@Test
	public void testAreRestanta() {
		Student student=new Student();
		int nota1=5, nota2=3, nota3=5;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testNuAreRestanta() {
		Student student=new Student();
		int nota1=5, nota2=9, nota3=5;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testGetNotaPozitieIncorecta() {
		Student student=new Student();
		
		int nota1=5, nota2=9, nota3=5;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		
		try {
			student.getNota(3);
			fail("metoda nu arunca exceptie");
		}catch(IndexOutOfBoundsException exception) {
			
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAdaugaNotaIncorecta() {
		Student student=new Student();
		
		int nota1=15;
		student.adaugaNota(nota1);
	}
}