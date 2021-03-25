package ro.ase.cts.FactoryMethod.clase;

public abstract class PersonalSpital {

	public String nume;




	public PersonalSpital(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public String toString() {
		return "PersonalSpital [nume=" + nume + "]";
	}

}