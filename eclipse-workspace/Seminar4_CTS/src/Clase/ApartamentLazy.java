package Clase;

public class ApartamentLazy {
	private String nume_proprietar;
	private int nrCamere;
	private float pret;
	
	private static ApartamentLazy apartament = null;
	
	private ApartamentLazy(String nume_proprietar, int nrCamere, float pret) {
		super();
		this.nume_proprietar = nume_proprietar;
		this.nrCamere= nrCamere;
		this.pret = pret;
	}
	
	public void setNume_proprietar(String nume_proprietar) {
		this.nume_proprietar = nume_proprietar;
	}

	public void setNrCamere(int nrCamere) {
		this.nrCamere = nrCamere;
	}

	public void setPret(float pret) {
		this.pret= pret;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Apartament [nume_proprietar=");
		builder.append(nume_proprietar);
		builder.append(", nrCamere=");
		builder.append(nrCamere);
		builder.append(", pret=");
		builder.append(pret);
		builder.append("]");
		return builder.toString();
	}
	
	public static synchronized ApartamentLazy getInstance(String nume_proprietar, int nrCamere,float pret) {
		if(apartament==null) {
			apartament = new ApartamentLazy(nume_proprietar,nrCamere,pret);
		}
		return apartament;
	}
}