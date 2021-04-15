package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.ComponentaMeniu;
import ro.ase.cts.composite.clase.Element;
import ro.ase.cts.composite.clase.Sectiune;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		ComponentaMeniu sectiune1=new Sectiune("Supe/Ciorbe");
		ComponentaMeniu sectiune2=new Sectiune("Desert");
		
		ComponentaMeniu element1=new Element("Ciorba de burta");
		ComponentaMeniu element2=new Element("Supa de gaina");
		ComponentaMeniu element3=new Element("Papanasi");

		sectiune1.adaugaNod(element1);
		sectiune1.adaugaNod(element2);
		sectiune2.adaugaNod(element3);
		
		ComponentaMeniu meniu=new Sectiune("Meniu");
		meniu.adaugaNod(sectiune1);
		meniu.adaugaNod(sectiune2);
		
		meniu.printeaza();
		
		sectiune1.stergeNod(element2);
		
		System.out.println();
		meniu.printeaza();
	}

}