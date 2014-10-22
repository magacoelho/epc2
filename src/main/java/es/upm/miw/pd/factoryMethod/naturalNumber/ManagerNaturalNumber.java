package es.upm.miw.pd.factoryMethod.naturalNumber;

public class ManagerNaturalNumber {
	private NaturalNumber naturalNumber;
	private NaturalNumberCreator naturalNumberCreator;
	
	public void createNaturalNumberCreator(){
		this.naturalNumber=this.naturalNumberCreator.create();
		
	}
  public void setNaturalNumberCreator(NaturalNumberCreator naturalNumberCreator) {
	this.naturalNumberCreator = naturalNumberCreator;
   }
 public NaturalNumber getNaturalNumber() {
	return naturalNumber;
}

}
