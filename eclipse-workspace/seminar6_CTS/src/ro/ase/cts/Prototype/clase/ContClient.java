package ro.ase.cts.Prototype.clase;

public class ContClient implements AbstractPrototype {
	private String nume;
	private int varsta;
	private int codClient;
	
	
	public ContClient(String nume, int varsta, int codClient) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.codClient = codClient;
	}
	

	private ContClient() {
		super();
	}


	public AbstractPrototype copiaza() {
		ContClient contClient=new ContClient();//nu e costisitor
		
		//copiez elementele deja validate
		contClient.nume=this.nume;
		contClient.varsta=this.varsta;

		contClient.codClient=this.codClient;

		
		return contClient;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContClient [nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", codClient=");
		builder.append(codClient);
		builder.append("]");
		return builder.toString();
	}

}