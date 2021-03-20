package program;

import Clase.Parlament;
import Clase.ParlamentLazy;

public class Main {
	
public static void main(String[] args) {
		
		Parlament parlament1=Parlament.getInstance();
		Parlament parlament2=Parlament.getInstance();
		System.out.println(parlament1.toString());
		System.out.println(parlament2.toString());
		
		parlament1.setTara("Romania");
		parlament2.setNrParlamentari(50);
		System.out.println(parlament1.toString());
		System.out.println(parlament2.toString());
		
		
		ParlamentLazy parlamentLazy1=ParlamentLazy.getInstance("Germania",100,4,"lllll");
		ParlamentLazy parlamentLazy2=ParlamentLazy.getInstance("Polonia",200,4,"pppp");
		
		System.out.println(parlamentLazy1);
		System.out.println(parlamentLazy2);


}
}
