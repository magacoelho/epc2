package es.upm.miw.pd.text.solution;

public  class FactoriaCaracter {
    private static FactoriaCaracter factoriaCaracter=null;
	private FactoriaCaracter(){
		
	}
    public static FactoriaCaracter getFactoria() {
		if(FactoriaCaracter.factoriaCaracter==null)
		   return new FactoriaCaracter();
		else
	       return FactoriaCaracter.factoriaCaracter;		
	}
	public Componente get(char c) {
		// TODO Auto-generated method stub
		return null;
	}

}
