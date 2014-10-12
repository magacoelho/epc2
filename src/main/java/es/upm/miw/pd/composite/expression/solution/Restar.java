package es.upm.miw.pd.composite.expression.solution;

public class Restar extends Operation{
   
	public Restar(Expression expression1, Expression expression2) {
		super(expression1, expression2);
		this.sign="+";
	}

	@Override
	public int operar() {
		// TODO Auto-generated method stub
		return expression1.operar()-expression2.operar();
	}

}
