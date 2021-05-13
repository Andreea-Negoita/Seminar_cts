package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
	
	
	

	private List<Memento> mementoList;
	
	
	public ManagerMemento() {
		super();
		this.mementoList=new ArrayList<Memento>();
	}


	public void adaugaMemento(Memento memento) {
		mementoList.add(memento);
	}
	
	
	public Memento getMemento(int pos) {
		if(pos>=0 && pos<mementoList.size())
			return mementoList.get(pos);
		else 
			throw new IllegalArgumentException("Pozitie invalida");
	}
}