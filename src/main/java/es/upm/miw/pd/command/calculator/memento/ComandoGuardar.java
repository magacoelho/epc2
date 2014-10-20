package es.upm.miw.pd.command.calculator.memento;

import upm.jbb.IO;


public class ComandoGuardar extends ComandoAbs {
    private static final String nameComando= "Guardar";
    private GestorMementos<MementoCalculadora> gm;
	public ComandoGuardar(CalculadoraMementable calc, GestorMementos<MementoCalculadora> gm) {
		super(calc, nameComando);
		this.gm=gm;
		
	}
    @Override
    public void execute() {
		CalculadoraMementable c = (CalculadoraMementable) calculadora;
		gm.addMemento(IO.in.readString("Nombre del Memento"),c.guardar());
	}


}
