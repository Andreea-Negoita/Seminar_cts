package Clase;

public class Parlament {
	
	private String tara;
	private int nrParlamentari;
	private int durataMandat;
	private String denumireSediu;
	
	
	private static Parlament parlament=new Parlament("Franta",100,4,"aaaa");
	
	private Parlament(String tara, int nrParlamentari, int durataMandat,String denumireSediu) {
		super();
		this.tara = tara;
		this.nrParlamentari = nrParlamentari;
		this.durataMandat = durataMandat;
		this.denumireSediu=denumireSediu;
	}
	
	public void setTara(String tara) {
		this.tara = tara;
	}

	public void setNrParlamentari(int nrParlamentari) {
		this.nrParlamentari = nrParlamentari;
	}

	public void setDurataMandat(int durataMandat) {
		this.durataMandat = durataMandat;
	}
	
	public void setDenumireSediu(String denumireSediu) {
		this.denumireSediu = denumireSediu;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Parlament [tara=");
		builder.append(tara);
		builder.append(", nrParlamentari=");
		builder.append(nrParlamentari);
		builder.append(", durataMandat=");
		builder.append(durataMandat);
		builder.append(denumireSediu);
		builder.append("]");
		return builder.toString();
	}
	
	public static Parlament getInstance() {
		return parlament;
	}
}



