package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.Cont;
import ro.ase.cts.chain.clase.ContCredit;
import ro.ase.cts.chain.clase.ContCurent;
import ro.ase.cts.chain.clase.ContEconomii;

public class Main {

	public static void main(String[] args) {
		

		Cont contCurent=new ContCurent(100);
		Cont contCredit=new ContCredit(230);
		Cont contEconomii=new ContEconomii(120);
		
		contCurent.setSuccesor(contCredit);
		contCredit.setSuccesor(contEconomii);
		
		contCurent.plateste(50);
		contCurent.plateste(150);
		contCurent.plateste(50);
		contCurent.plateste(100);
		contCurent.plateste(100);
	}

}