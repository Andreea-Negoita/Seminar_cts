package ro.ase.cts.command.clase;

import java.util.ArrayList;
import java.util.List;


public class ManagerComenzi {

	private List<Command> comenzi;
	
	public ManagerComenzi() {
		super();
		this.comenzi=new ArrayList<Command>();
	}
	
	public void invoca(Command command) {
		comenzi.add(command);
	}
	
	public void executaComanda() {
		if(!comenzi.isEmpty()) {
			comenzi.get(0).executa();
			comenzi.remove(0);
		}
	}
}