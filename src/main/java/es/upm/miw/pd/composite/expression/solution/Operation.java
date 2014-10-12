package es.upm.miw.pd.composite.expression.solution;

public abstract class Operation extends Expression {
    private Expression expression1;
    private Expression expression2;
    protected String sign;
    
	private Operation(Expression expression1, Expression expression2) {
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
