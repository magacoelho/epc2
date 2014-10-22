package es.upm.miw.pd.factoryMethod.naturalNumber;

import upm.jbb.IO;

public class NaturalNumberMain {
	 private NaturalNumberCreator[] creadores = {new NaturalNumberCreatorEs(), new NaturalNumberCreatorEn(), new NaturalNumberCreatorFr()}; 
     private NaturalNumberCreator creador = creadores[0]; 

     public void tipoCreador() { 
       this.creador = (NaturalNumberCreator) IO.in.select(creadores, "Elige un creador"); 
	    } 
    public void crearNaturalNumber() { 
       IO.out.println("Creado NaturalN number: " + this.creador.create().getTextValue()); 
    } 
    public static void main(String[] args) { 
	        IO.in.addController(new NaturalNumberMain()); 
    } 
}
