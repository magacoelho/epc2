package es.upm.miw.pd.text.solution;

public class Caracter extends Componente{
    private char c;
	public Caracter(char key) {
		
	}
	@Override
	public void add(Componente c) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isComposite() {
		
		return false;
	}
	@Override
	public String dibujar(boolean b) {
		// TODO Auto-generated method stub
		if(b)
			return String.valueOf(c).toUpperCase();
		return String.valueOf(c);
	}

}
