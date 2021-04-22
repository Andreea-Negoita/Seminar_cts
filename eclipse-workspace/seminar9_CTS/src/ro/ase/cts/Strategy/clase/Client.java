package ro.ase.cts.Strategy.clase;

public class Client {
	
	private Strategy strategy;
	private String nume;
	
	public Client(String nume, Strategy strategy) {
		super();
		this.nume = nume;
		this.strategy=strategy;
	}
	
	public void setStrategy(Strategy strategy) {
		this.strategy=strategy;
	}
	
	public void platesteNota(float suma) {
		System.out.println(nume+" are de plata "+suma+" lei");
		strategy.realizeazaPlata(suma);
	}

}