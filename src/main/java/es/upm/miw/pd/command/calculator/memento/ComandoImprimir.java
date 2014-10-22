package es.upm.miw.pd.command.calculator.memento;

import upm.jbb.IO;

public class ComandoImprimir extends ComandoAbs{
	private static final String nameComando= "Imprimir";
	public ComandoImprimir(Calculadora calc) {
		super(calc,nameComando);
	}

	@Override
	public void execute()
	{
	
		IO.out.println(calculadora.getTotal());
	}


}
