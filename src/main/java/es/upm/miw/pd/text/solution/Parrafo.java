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
	public String dibujar(boolean b) {
		String parrafo ="";
		for (Componente componente : componentes) {
			
			parrafo+=componente.dibujar(b);
		}
		return parrafo+"\n";
	}
	
}
