package es.upm.miw.pd.text.solution;

import java.util.ArrayList;
import java.util.List;

public abstract class Compuesto extends Componente{
	protected List<Componente> componentes = new ArrayList<Componente>();	
    
    @Override
	public boolean isComposite() {
		return true;
	}
    protected void borrar(Componente c) {
		componentes.remove(c);
	}
}
