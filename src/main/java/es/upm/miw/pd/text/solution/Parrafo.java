package es.upm.miw.pd.text.solution;

import java.util.List;

public class Parrafo extends Compuesto {
    public Parrafo(){
    	
    }
	@Override
	public void add(Componente c) {
		if(c.isComposite()){
			throw new UnsupportedOperationException("Operación no soportada");
		}
		else
		{
			this.componentes.add(c);
		}
	}

	@Override
	public boolean isComposite() {
		
		return true;
	}

	@Override
	public String dibujar(boolean b) {
		String parrafo;
		if(b)
		{}
		else{}
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	protected void borrar(Componente c) {
		// TODO Auto-generated method stub
		
	}

}
