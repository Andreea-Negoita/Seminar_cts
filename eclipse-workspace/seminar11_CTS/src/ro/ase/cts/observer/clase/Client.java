package ro.ase.cts.observer.clase;

public class Client implements Observer{

	private String nume;
	
	public Client(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void receptioneazaMesaj(String mesaj) {
		System.out.println(this.nume+" a primit mesajul "+mesaj);
		
	}

}