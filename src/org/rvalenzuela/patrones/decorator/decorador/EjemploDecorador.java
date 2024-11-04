package org.rvalenzuela.patrones.decorator.decorador;

import org.rvalenzuela.patrones.decorator.Formateable;
import org.rvalenzuela.patrones.decorator.Texto;

public class EjemploDecorador {
    public static void main(String[] args) {

        Formateable texto = new Texto("Hola que tal Ricardo");

        MayusculasDecorador mayuscula = new MayusculasDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);


        System.out.println(subrayar.darFormato());
    }
}
