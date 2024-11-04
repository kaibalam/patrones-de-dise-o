package org.rvalenzuela.patrones.factory;

import org.rvalenzuela.patrones.factory.producto.PizzaCaliforniaPepperoni;
import org.rvalenzuela.patrones.factory.producto.PizzaCaliforniaQueso;
import org.rvalenzuela.patrones.factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "queso" -> producto =   new PizzaCaliforniaQueso();
            case "pepperoni" ->  producto =  new PizzaCaliforniaPepperoni();
            case "vegetariana" ->  producto =  new PizzaCaliforniaVegetariana();

        }
        return producto;
    }
}
