package ro.ase.cts.state.clase;

public class MasaLibera implements Stare {

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof MasaOcupata || masa.getStare() instanceof MasaRezervata) {
			masa.setStare(this);
			System.out.println("Masa cu nr "+masa.getNrMasa()+" s-a eliberat");
		}
		else {
			System.out.println("Masa este libera deja");
		}
		
	}

}