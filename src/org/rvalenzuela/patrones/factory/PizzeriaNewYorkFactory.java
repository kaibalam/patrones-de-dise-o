package org.rvalenzuela.patrones.factory;

import org.rvalenzuela.patrones.factory.producto.PizzaNewYorkItaliana;
import org.rvalenzuela.patrones.factory.producto.PizzaNewYorkPepperoni;
import org.rvalenzuela.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {

        PizzaProducto producto = null;

        switch (tipo) {
            case "vegetariana" -> producto = new PizzaNewYorkVegetariana();
            case "pepperoni" -> producto = new PizzaNewYorkPepperoni();
            case "italiana" -> producto = new PizzaNewYorkItaliana();
            default -> {
            }
        }
        return producto;
    }
}
