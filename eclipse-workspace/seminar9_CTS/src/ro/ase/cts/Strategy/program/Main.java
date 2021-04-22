package ro.ase.cts.Strategy.program;

import ro.ase.cts.Strategy.clase.BonuriMasa;
import ro.ase.cts.Strategy.clase.Card;
import ro.ase.cts.Strategy.clase.Client;
import ro.ase.cts.Strategy.clase.Portofel;
import ro.ase.cts.Strategy.clase.Strategy;

public class Main {

	public static void main(String[] args) {
		
		
		
		Strategy cardStrategy=new Card();
		Strategy cashStrategy=new Portofel(200);
		Client client=new Client("Marin",cashStrategy);
		
		client.platesteNota(200);
		client.platesteNota(200);
		client.setStrategy(cardStrategy);
		client.platesteNota(200);
		
		Strategy bonuriStrategy=new BonuriMasa();
		client.setStrategy(bonuriStrategy);
		client.platesteNota(150);
	}
}