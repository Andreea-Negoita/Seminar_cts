package ro.ase.cts.composite.clase;

public class Element implements ComponentaMeniu {

	private String numeElement;

	public Element(String numeElement) {
		super();
		this.numeElement = numeElement;
	}

	@Override
	public void adaugaNod(ComponentaMeniu componentaMeniu) throws Exception {
		throw new Exception("Metoda neimplementata!");
	}

	@Override
	public void stergeNod(ComponentaMeniu componentaMeniu) {
		throw new IllegalArgumentException("Metoda neimplementata!");
	}

	@Override
	public ComponentaMeniu getNod(int index) {
		System.out.println("Metoda neimplementata!");
		return null;
	}

	@Override
	public void printeaza() {
		System.out.println("Element "+ numeElement);
		
	}
}