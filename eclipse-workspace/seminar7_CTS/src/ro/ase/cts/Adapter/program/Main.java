package ro.ase.cts.Adapter.program;

import ro.ase.cts.Adapter.clase.AdapterCreditObiecte;
import ro.ase.cts.Adapter.clase.CreditAbstract;
import ro.ase.cts.Adapter.clase.Leasing;

public class Main {
	
	private static void afiseazaInfoCredit(CreditAbstract credit, float suma) {
		credit.oferaCredit(suma);
	}

	
	public static void main(String[] args) {
		
		Leasing leasing=new Leasing(100, "Ion");
		AdapterCreditObiecte adapter=new AdapterCreditObiecte(leasing);
		
	
		afiseazaInfoCredit(adapter, leasing.getSuma());
	}

}