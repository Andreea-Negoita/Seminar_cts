package ro.ase.cts.Strategy.clase;

public class BonuriMasa implements Strategy {

	@Override
	public void realizeazaPlata(float suma) {
		System.out.println("Tranzactia a fost efectuata cu bonuri de masa pt suma de "+suma);
			
	}
}