package ro.ase.cts.Builder.Program;

import ro.ase.cts.Builder.clase.Rezervare;
import ro.ase.cts.Builder.clase.RezervareBuilder;
import ro.ase.cts.Builder.clase.RezervareBuilderV2;


public class Main {

	public static void main(String[] args) {
		
		Rezervare rezervare1=new RezervareBuilder().setCodRezervare(20).setAreBauturaInclusa(true).build();
		Rezervare rezervare2=new RezervareBuilder(12).setAreMuzicaAmbientala(true).setGenMuzica("clasic").build();
		
		Rezervare rezervare3 = new Rezervare(false, true, true, false, null, 70);
		
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
		System.out.println(rezervare3.toString());
		
		
	
		RezervareBuilder newBuilder=new RezervareBuilder().setAreMancareInclusa(true).setAreBauturaInclusa(true).setAreScaunErgonomic(true);
		Rezervare rezervare4= newBuilder.setCodRezervare(100).build();
		Rezervare rezervare5= newBuilder.setCodRezervare(101).build();
		
	}
	


RezervareBuilderV2 newBuilderV2= new RezervareBuilderV2().setAreMancareInclusa(true).setAreBauturaInclusa(true).setAreScaunErgonomic(true);
Rezervare rezervare6= newBuilderV2.setCodRezervare(100).build();
Rezervare rezervare7= newBuilderV2.setCodRezervare(101).build();
}

