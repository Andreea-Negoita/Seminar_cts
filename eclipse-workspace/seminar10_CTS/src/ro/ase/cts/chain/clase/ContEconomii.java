package ro.ase.cts.chain.clase;

public class ContEconomii extends Cont {
	
	public ContEconomii(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold()>suma) {
			System.out.println("S-a platit cu contul pentru economii");
			super.setSold(super.getSold()-suma);
		}
		else {
			if(super.getSuccesor()==null) {
				System.out.println("Nu se poate efectua plata");
			}
			else {
				super.getSuccesor().plateste(suma);
			}
		}
	}
}
