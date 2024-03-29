package es.upm.miw.pd.command.calculator.memento;

import es.upm.miw.pd.command.calculator.memento.ComandoImprimir;
import es.upm.miw.pd.command.calculator.memento.ComandoIniciar;
import es.upm.miw.pd.command.calculator.memento.ComandoRestar;
import es.upm.miw.pd.command.calculator.memento.ComandoSumar;
import upm.jbb.IO;

public class MainCalculadora {
    private GestorComandos gestor;

    public MainCalculadora() {
        CalculadoraMementable calc = new CalculadoraMementable();
        this.gestor = new GestorComandos();
        this.gestor.add(new ComandoSumar(calc));
        this.gestor.add(new ComandoRestar(calc));
        this.gestor.add(new ComandoIniciar(calc));
        this.gestor.add(new ComandoImprimir(calc));
        GestorMementos<MementoCalculadora> gm = new GestorMementos();
        this.gestor.add(new ComandoGuardar(calc,gm));
        this.gestor.add(new ComandoDeshacer(calc,gm));
    }

    public void ejecutar() {
        String key = (String) IO.in.select(this.gestor.keys());
        this.gestor.execute(key);
    }

    public static void main(String[] args) {
        IO.in.addController(new MainCalculadora());
    }
}
