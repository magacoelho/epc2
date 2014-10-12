package es.upm.miw.pd.composite.expression.solution;

public class Multiplicar extends Operation{
   
	public Multiplicar(Expresion expression1, Expresion expression2) {
		super(expression1, expression2);
		this.sign="*";
	}

	@Override
	public int operar() {
		// TODO Auto-generated method stub
		return expression1.operar()*expression2.operar();
	}

}
