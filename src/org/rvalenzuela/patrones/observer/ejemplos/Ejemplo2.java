package org.rvalenzuela.patrones.observer.ejemplos;

import org.rvalenzuela.patrones.observer.UsuarioRepositorio;

public class Ejemplo2 {
    public static void main(String[] args) {

        UsuarioRepositorio repositorio = new UsuarioRepositorio();

        repositorio.addObserver((o, u) -> System.out.println("Enviando un email al usuario " +u));
        repositorio.addObserver((o, u) -> System.out.println("Enviando un email al administrador "+ u));
        repositorio.addObserver((o, u) -> System.out.println("Guardando info del usuario en el logs "+ u));
        repositorio.crearUsuario("Ricardo");

    }
}
