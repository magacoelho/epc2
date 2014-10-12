package es.upm.miw.pd.composite.expression.solution;

public class Numero extends Expression{
	private int valor;
    
	
	private Numero(int valor) {
		super();
		this.valor = valor;
	}
   
	
	public int getValor() {
		return valor;
	}


	@Override
	public int operar() {
		// TODO Auto-generated method stub
		return this.getValor();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	  

}
