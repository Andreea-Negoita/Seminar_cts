package ro.ase.cts.SimpleFactory.clase;

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


}