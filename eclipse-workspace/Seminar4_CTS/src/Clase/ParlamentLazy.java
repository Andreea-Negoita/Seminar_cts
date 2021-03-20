package Clase;

public class ParlamentLazy {
	
	
	private String tara;
	private int nrParlamentari;
	private int durataMandat;
	private String denumireSediu;
	
	private static ParlamentLazy parlament = null;
	
	private ParlamentLazy(String tara, int nrParlamentari, int durataMandat, String denumireSediu) {
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
		this.denumireSediu= denumireSediu;
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
	
	public static synchronized ParlamentLazy getInstance(String tara, int nrParlamentari, int durataMandat, String denumireSediu) {
		if(parlament==null) {
			parlament = new ParlamentLazy(tara,nrParlamentari,durataMandat, denumireSediu);
		}
		return parlament;
	}
}

