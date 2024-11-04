package org.rvalenzuela.patrones.decorator.decorator2;

import org.rvalenzuela.patrones.decorator.decorator2.decorador.ConChocolateDecorador;
import org.rvalenzuela.patrones.decorator.decorator2.decorador.ConCremaDecorador;
import org.rvalenzuela.patrones.decorator.decorator2.decorador.ConLecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {

        Configurable cafe = new Cafe( 7, "Cafe Mocha,");
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChocolate = new ConChocolateDecorador(conLeche);

        System.out.println("El precio del cafe moca es: "+conChocolate.getPrecioBase());
        System.out.println("Los ingredientes: " + conChocolate.getIngredientes());

        Configurable capuchino = new Cafe(4,"Café capuchino,");
        conCrema = new ConCremaDecorador(capuchino);
        conLeche = new ConLecheDecorador(conCrema);
        System.out.println("El precio del capuchino es: "+conLeche.getPrecioBase());
        System.out.println("Los ingredientes: "+conLeche.getIngredientes());

        Configurable expresso = new Cafe(3, "Cafe Expresso, ");
        System.out.println("El precio del café expresso: "+expresso.getPrecioBase());
        System.out.println("Los ingredientes: "+expresso.getIngredientes());


    }
}
