package es.upm.miw.pd.command.calculator.memento;

public interface Mementable<T> {
    T guardar();

    void deshacer(T memento);

}
