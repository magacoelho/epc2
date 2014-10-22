package es.upm.miw.pd.text.solution;

public class Caracter extends Componente{
    private Character caracter;
	public Caracter(char key) {
		this.caracter = Character.valueOf(key);
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
			return String.valueOf(caracter).toUpperCase();
		return String.valueOf(caracter);
	}

}
