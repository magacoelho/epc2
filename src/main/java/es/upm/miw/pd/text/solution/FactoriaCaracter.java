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
			FactoriaCaracter.factoriaCaracter=new  FactoriaCaracter();

	       return FactoriaCaracter.factoriaCaracter;		
	}
	public Caracter get(char c) {
		Character key = Character.valueOf(c);
		if (map.containsKey(key)) { 
              return map.get(key); 
          } else { 

           Caracter pl = new Caracter(key); 
           map.put(key, pl); 
           return pl; 
       } 
    } 
}
