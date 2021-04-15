package ro.ase.cts.decorator.clase;

public abstract class DecoratorAbstract implements NotaAbstracta {

	private NotaAbstracta nota;
	
	public DecoratorAbstract(NotaAbstracta nota) {
		super();
		this.nota = nota;
	}

	@Override
	public void printeaza() {
		nota.printeaza();
	}
	
	public abstract void printeazaFelicitare();
	
}