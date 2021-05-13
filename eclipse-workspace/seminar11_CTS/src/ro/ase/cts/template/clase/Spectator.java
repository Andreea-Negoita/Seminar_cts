package ro.ase.cts.template.clase;

public class Spectator extends TemplateSpectator {

	private String nume;
	
	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void seAseazaLaCoada() {
		System.out.println(nume+" se aseaza la coada");
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println(nume+" prezinta bilet");
		
	}

	@Override
	public void seFaceControlulCorporal() {
		System.out.println(nume+" a trecut controlul corporal");
		
	}

	@Override
	public void ocupaLocul() {
		System.out.println(nume+" a ocupat un loc");
		
	}

	
}