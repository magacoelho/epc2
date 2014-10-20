package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class ComandoRestar extends ComandoAbs {
	 private static final String nameComando= "Restar";
	public ComandoRestar(Calculadora calc) {
		super(calc,nameComando);
	}

	@Override
	public void execute()
	{
		int valor = IO.in.readInt();
		calculadora.restar(valor);
	}

	
	

}
