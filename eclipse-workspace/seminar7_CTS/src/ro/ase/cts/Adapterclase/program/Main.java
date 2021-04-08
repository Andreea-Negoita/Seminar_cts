package ro.ase.cts.Adapterclase.program;

import ro.ase.cts.Adapterclase.clase.AdapterCreditClase;
import ro.ase.cts.Adapterclase.clase.CreditAbstract;

public class Main {
	
	private static void afiseazaInfoCredit(CreditAbstract credit) {
		credit.oferaCredit();
	}

	public static void main(String[] args) {
		
				
		AdapterCreditClase adapter=new AdapterCreditClase(150, "Ionel");
				
		afiseazaInfoCredit(adapter);
	}
}