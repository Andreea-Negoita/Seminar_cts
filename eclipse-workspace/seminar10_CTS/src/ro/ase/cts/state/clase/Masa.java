package ro.ase.cts.state.clase;

public class Masa {

	private int nrMasa;
	private Stare stare;
	
	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stare = new MasaLibera();
	}
	
	public Stare getStare() {
		return stare;
	}
	//facem default SAU protected sa nu se poata modifica starea in Main 
	void setStare(Stare stare) {
		this.stare = stare;
	}
	public int getNrMasa() {
		return nrMasa;
	}
	
	//request-uri
	public void ocupaMasa() {
		Stare masa=new MasaOcupata();
		masa.modificaStare(this);
	}
	public void rezervaMasa() {
		Stare masa=new MasaRezervata();
		masa.modificaStare(this);
	}
	public void elibereazaMasa() {
		Stare masa=new MasaLibera();
		masa.modificaStare(this);
	}
	
}