package es.upm.miw.pd.command.calculator.memento;

import upm.jbb.IO;


public class ComandoDeshacer extends ComandoAbs {
    private static final String nameComando= "Deshacer";
	private GestorMementos<MementoCalculadora> gm;
    public ComandoDeshacer(CalculadoraMementable calc, GestorMementos<MementoCalculadora> gm) {
		super(calc, nameComando);
		this.gm=gm;
		
	}
    @Override
    public void execute() {
		CalculadoraMementable c = (CalculadoraMementable) calculadora;
		c.deshacer(this.gm.getMemento((String) IO.in.select(gm.keys(), "Restaurar")));
		
	}


}
