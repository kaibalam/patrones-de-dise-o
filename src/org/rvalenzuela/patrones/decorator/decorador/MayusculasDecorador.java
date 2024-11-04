package org.rvalenzuela.patrones.decorator.decorador;

import org.rvalenzuela.patrones.decorator.Formateable;

public class MayusculasDecorador extends TextoDecorador{
    public MayusculasDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
