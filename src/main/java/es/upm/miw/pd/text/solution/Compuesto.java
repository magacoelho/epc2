package es.upm.miw.pd.text.solution;

import java.util.ArrayList;
import java.util.List;

public abstract class Compuesto extends Componente{
	protected List<Componente> componentes = new ArrayList<Componente>();	
    protected abstract void borrar(Componente c);
}
