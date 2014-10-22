package es.upm.miw.pd.text.solution;

public abstract class Componente {
	public abstract void add(Componente c);
	public abstract boolean isComposite();
	public abstract String dibujar(boolean b);

}
