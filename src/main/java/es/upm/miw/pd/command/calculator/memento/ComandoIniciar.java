package es.upm.miw.pd.command.calculator.memento;

import upm.jbb.IO;


public class ComandoIniciar extends ComandoAbs {
    private static final String nameComando= "Iniciar";
	public ComandoIniciar(Calculadora calc) {
		super(calc, nameComando);
		
	}
    @Override
    public void execute() {
		
		calculadora.iniciar();
	}


}
