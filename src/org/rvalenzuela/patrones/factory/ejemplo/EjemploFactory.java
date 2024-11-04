package org.rvalenzuela.patrones.factory.ejemplo;

import org.rvalenzuela.patrones.factory.PizzaProducto;
import org.rvalenzuela.patrones.factory.PizzeriaCaliforniaFactory;
import org.rvalenzuela.patrones.factory.PizzeriaNewYorkFactory;
import org.rvalenzuela.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory cal = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = cal.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizza.getNombre());

        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("Andres ordena una pizza " + pizza.getNombre());

        pizza = cal.ordenarPizza("vegetariana");
        System.out.println("James ordena una pizza " + pizza.getNombre());

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Linus ordena la pizza " + pizza.getNombre());

        pizza = cal.ordenarPizza("pepperoni");
        System.out.println("John ordena la pizza " + pizza.getNombre());

        System.out.println("pizza = " + pizza);
    }
}
