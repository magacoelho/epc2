package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberFr extends NaturalNumber {
	private static final String[] traduccion = {"zéro","un", "deux", "trois", "quatre", "cinq" };
    public NaturalNumberFr(int value) {
        this.setValue(value);
        textValue=traduccion;
    }

}
