package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Masa;

public class Main {

	public static void main(String[] args) {
		

		Masa masa=new Masa(13);
		Masa masa2=new Masa(14);
		
		masa.elibereazaMasa();
		masa.rezervaMasa();
		masa.ocupaMasa();
		masa.rezervaMasa();
		
		//masa.setStare(new MasaLibera());
		masa.ocupaMasa();
		
		masa2.ocupaMasa();
		masa2.elibereazaMasa();
	}
}