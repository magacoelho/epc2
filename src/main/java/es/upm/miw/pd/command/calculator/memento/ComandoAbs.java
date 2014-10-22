package es.upm.miw.pd.command.calculator.memento;



public abstract class ComandoAbs  implements Comando {
    protected String name;
	protected Calculadora calculadora;

	public ComandoAbs(Calculadora calc,String name) {
	 this.calculadora= calc;
	 this.name =name;
	}
	public String name() {
		return name;
	}
	

}