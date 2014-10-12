package es.upm.miw.pd.composite.expression.solution;

public abstract class Operation extends Expresion {
    protected Expresion expression1;
    protected Expresion expression2;
    protected String sign;
    
	public Operation(Expresion expression1, Expresion expression2) {
		super();
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

	@Override
	public  abstract  int operar();
	@Override
	public String toString() {
		return "(" + expression1.toString() + sign + expression2.toString() + ")";
	}

}
