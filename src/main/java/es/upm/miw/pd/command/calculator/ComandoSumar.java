package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class ComandoSumar extends ComandoAbs {
   private static final String nameComando= "Sumar";
	public ComandoSumar(Calculadora calc) {
		super(calc,nameComando);
	}

	@Override
	public void execute()
	{
		int valor = IO.in.readInt();
		calculadora.sumar(valor);
	}

}
