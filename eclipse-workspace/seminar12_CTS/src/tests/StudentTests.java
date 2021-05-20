package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.testJunit.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParmetru() {
		String nume="Gigel";
		Student student=new Student(nume);
		assertEquals("Numele nu a fost initializat", nume, student.getNume());
		//assertNotEquals(null,student.getNote());
		assertNotNull("Lista de note nu a fost initializata",student.getNote());
	}
	
	@Test
	public void testConstructorFaraParmetru() {
		Student student=new Student();
		assertNotNull("Numele nu a fost initializat",student.getNote());
		assertNotNull("Lista de note nu a fost initializata",student.getNume());
	}
	
	@Test
	public void testSetterNume() {
		String nume="Gigel";
		Student student=new Student(nume);
		
		student.setNume(nume);
		assertEquals(nume, student.getNume());
		
	}
	
	@Test
	public void testAdaugareNotainLista(){
		
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
		}
	
	
	@Test
	public void testDimensiuneLista() {

		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
		
		}
	
	
	
	
}


