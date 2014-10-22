package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber {
	private static final String[] traduccion = {"zero","one", "two", "three", "four", "five" };
    public NaturalNumberEn(int value) {
        this.setValue(value);
        textValue=traduccion;
    }

}
