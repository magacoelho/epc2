package es.upm.miw.pd.text.solution;

import java.util.HashMap;
import java.util.Map;

public  class FactoriaCaracter {
	private final Map<Character, Caracter> map = new HashMap<Character, Caracter>(); 

    private static FactoriaCaracter factoriaCaracter=null;
	private FactoriaCaracter(){
		
	}
    public static FactoriaCaracter getFactoria() {
		if(FactoriaCaracter.factoriaCaracter==null)
		   return new FactoriaCaracter();
		else
	       return FactoriaCaracter.factoriaCaracter;		
	}
	public Caracter get(char key) {
		if (map.containsKey(key)) { 
              return map.get(key); 
          } else { 

           Caracter pl = new Caracter(key); 
           map.put(key, pl); 
           return pl; 
       } 
    } 
}
