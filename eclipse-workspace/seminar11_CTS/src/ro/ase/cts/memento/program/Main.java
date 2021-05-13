package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.MeciJucat;

public class Main {

	public static void main(String[] args) {
		
		
		
		MeciJucat meciJucat=new MeciJucat("Gazda1", "Oaspeti", 12, 12, 12, 12);
		
		ManagerMemento managerMemento=new ManagerMemento();
		managerMemento.adaugaMemento(meciJucat.creareMemento());
		
		meciJucat.setNumeGazda("Host");
		meciJucat.setNumeOaspeti("Losers");
		meciJucat.setNrSpectatori(100);
		meciJucat.setNrJandarmi(10);
		
		managerMemento.adaugaMemento(meciJucat.creareMemento());
		
		System.out.println(meciJucat.toString());
		meciJucat.setMemento(managerMemento.getMemento(0));
		System.out.println(meciJucat.toString());

	}

}