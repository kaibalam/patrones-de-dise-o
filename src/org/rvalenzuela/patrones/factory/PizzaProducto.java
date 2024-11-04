package org.rvalenzuela.patrones.factory;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProducto {
    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public PizzaProducto() {
        this.ingredientes = new ArrayList<>();
    }

    public void preparar (){
        System.out.println("Preparando "+ nombre);
        System.out.println("Seleccionando la masa "+ masa);
        System.out.println("agregando salsa "+ salsa);
        System.out.println("agregando ingredientes ");
        this.ingredientes.forEach(System.out::println);
    }
    abstract public void cocinar();
    abstract public void cortar();
    public void empaquetar(){
        System.out.println("Poniendo la pizza en una caja de empaque... ");
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "PizzaProducto{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
