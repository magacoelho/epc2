package es.upm.miw.pd.text.solution;

public class Texto extends Compuesto{

	@Override
	public void add(Componente c) {
		if(!c.isComposite()){
			throw new UnsupportedOperationException("Operación no soportada");
		}
		else
		{
			this.componentes.add(c);
		}
		
	}

	@Override
	public String dibujar(boolean b) {
		String texto ="";
		for (Componente componente : componentes) {
			
			texto+=componente.dibujar(b);
		}
		return texto+"---o---\n";
		
	}
}

	
