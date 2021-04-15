package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorNotaLaMultiAni;
import ro.ase.cts.decorator.clase.DecoratorNotaPasteFericit;
import ro.ase.cts.decorator.clase.NotaAbstracta;
import ro.ase.cts.decorator.clase.NotaDePlata;

public class Main {

	public static void main(String[] args) {
		// DECORATOR
		// ex 7B

		NotaAbstracta nota=new NotaDePlata(100);
		nota.printeaza();
		
		DecoratorAbstract notaLaMultiAni=new DecoratorNotaLaMultiAni(nota);
		notaLaMultiAni.printeaza();
		notaLaMultiAni.printeazaFelicitare();
		
		System.out.println();
		
		DecoratorAbstract notaPaste= new DecoratorNotaPasteFericit(nota);
		notaPaste.printeaza();
		notaPaste.printeazaFelicitare();
		
		System.out.println();
		
		NotaAbstracta nota2=new NotaDePlata(89);
		DecoratorAbstract decoratorLMA= new DecoratorNotaLaMultiAni(nota2);
		DecoratorAbstract decoratorAbstract= new DecoratorNotaPasteFericit(decoratorLMA);
		decoratorAbstract.printeaza();
		decoratorAbstract.printeazaFelicitare();
	
	}
}