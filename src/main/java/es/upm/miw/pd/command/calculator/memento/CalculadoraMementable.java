package es.upm.miw.pd.command.calculator.memento;

public class CalculadoraMementable extends Calculadora implements Mementable<MementoCalculadora>{

	@Override
	public MementoCalculadora guardar() {
		// TODO Auto-generated method stub
		return new MementoCalculadora(this.getTotal());
	}

	@Override
	public void deshacer(MementoCalculadora memento) {
		this.setTotal(memento.getValor());
	}

	
}
