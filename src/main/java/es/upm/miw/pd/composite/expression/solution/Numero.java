package es.upm.miw.pd.composite.expression.solution;

public class Numero extends Expresion{
	private int valor;
    
	
	public Numero(int valor) {
	
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
		return String.valueOf(this.getValor());
	}
	
	  

}
