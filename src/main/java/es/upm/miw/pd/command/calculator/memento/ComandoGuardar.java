package es.upm.miw.pd.command.calculator.memento;

import upm.jbb.IO;


public class ComandoGuardar extends ComandoAbs {
    private static final String nameComando= "Guardar";
	public ComandoGuardar(CalculadoraMementable calc) {
		super(calc, nameComando);
		
	}
    @Override
    public void execute() {
		CalculadoraMementable c = (CalculadoraMementable) calculadora;
		c.guardar();
	}


}
