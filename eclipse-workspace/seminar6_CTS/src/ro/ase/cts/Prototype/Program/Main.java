package ro.ase.cts.Prototype.Program;

import ro.ase.cts.Prototype.clase.Bilet;
import ro.ase.cts.Prototype.clase.ContClient;

public class Main {

	public static void main(String[] args) {
		

		ContClient contClient1 = new ContClient("Ion", 21, 10);
		ContClient contClient2 = (ContClient) contClient1.copiaza();

		System.out.println(contClient1.toString());
		System.out.println(contClient2.toString());

		Bilet biletPrototype = new Bilet(1, "Ech1", "Ech2", "10/04/2021");
		Bilet bilet1 = (Bilet) biletPrototype.copiaza();
		bilet1.setCodBilet(100);
		Bilet bilet2 = (Bilet) biletPrototype.copiaza();
		bilet2.setCodBilet(101);
		
		System.out.println(bilet1.toString());
		System.out.println(bilet2.toString());
	}
}