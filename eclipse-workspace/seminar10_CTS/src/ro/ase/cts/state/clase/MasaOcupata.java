package ro.ase.cts.state.clase;

public class MasaOcupata implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof MasaOcupata) {
			System.out.println("Masa cu nr "+masa.getNrMasa()+" este ocupata deja");
		}
		else {
			masa.setStare(this);
			System.out.println("Masa cu nr "+masa.getNrMasa()+" s-a ocupat");
		}
	}

}