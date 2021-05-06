package ro.ase.cts.state.clase;

public class MasaRezervata implements Stare {

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof MasaLibera) {
			masa.setStare(this);
			System.out.println("Masa cu nr "+masa.getNrMasa()+" s-a rezervat");
		}
		else {
			System.out.println("Masa indisponibila");
		}
		
	}

}