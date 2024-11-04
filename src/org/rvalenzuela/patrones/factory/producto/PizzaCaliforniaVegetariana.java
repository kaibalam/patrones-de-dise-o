package org.rvalenzuela.patrones.factory.producto;

import org.rvalenzuela.patrones.factory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {
    public PizzaCaliforniaVegetariana() {
        super();
        nombre = "Pizza California vegetariana";
        masa = "masa delgada ligth";
        salsa = "Salsa BBQ ligth";
        ingredientes.add("Queso Mozarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Cebolla");
        ingredientes.add("Berenjena");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 min a 180 C ");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la piza en rebanadas rectangulares");
    }
}
