package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEs extends NaturalNumber {
	private static final String[] traduccion = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};
    public NaturalNumberEs(int value) {
        this.setValue(value);
        textValue=traduccion;
    }

}
