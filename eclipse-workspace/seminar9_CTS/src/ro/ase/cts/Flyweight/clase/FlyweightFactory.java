package ro.ase.cts.Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory implements Flyweight {

	private Map<String, Flyweight> clienti;
	
	public FlyweightFactory() {
		super();
		this.clienti=new HashMap<String, Flyweight>();
	}

	public Flyweight getClient(String nrTelefon) {
		Flyweight client=clienti.get(nrTelefon);
		if(client==null) {
			
			client=new Client("ClientNume", nrTelefon, "client@adresa.com");
			clienti.put(nrTelefon, client);
		}
		return client;
	}
	
	
	@Override
	public void printeazaRezervare(Rezervare rezervare) {
		// TODO Auto-generated method stub
		
	}

}