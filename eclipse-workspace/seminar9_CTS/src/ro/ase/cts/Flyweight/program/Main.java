package ro.ase.cts.Flyweight.program;

import ro.ase.cts.Flyweight.clase.FlyweightFactory;
import ro.ase.cts.Flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		
		Rezervare r1=new Rezervare(5, 3, 17);
		Rezervare r2=new Rezervare(12, 5, 20);
		Rezervare r3=new Rezervare(1, 2, 21);
		
		FlyweightFactory factory=new FlyweightFactory();
		factory.getClient("07333333333").printeazaRezervare(r1);
		factory.getClient("07333222111").printeazaRezervare(r2);
		factory.getClient("07333333333").printeazaRezervare(r3);
		
	}

}