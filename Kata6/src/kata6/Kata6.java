package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyProduct.Toy;
import business.ToyBusiness;
import factories.regionalFactories.*;

/**
 * @author Marcos del Cristo Díaz Gil
 * Ingeniería del Software 2, Universidad de Las Palmas de Gran Canaria
 */
public class Kata6 {

    public static void main(String[] args) {
        //ToyBusiness enterprise = new ToyBusiness(new AmericanToyFactory());
        ToyBusiness enterprise = new ToyBusiness();
        enterprise.add("car", new AmericanCarToyFactory());
        enterprise.add("heli", new AsianHelicopterToyFactory());
        enterprise.add("sub", new EuropeanSubmarineToyFactory());
        ArrayList<Toy> toys = new ArrayList<>();
        
        String line = "";
        Scanner input = new Scanner(System.in);
        
        System.out.println("CLI de la Juguetera Díaz");
        System.out.println("Teclee 'car' para generar un coche, 'heli' para generar un helicóptero"
        + "\n o 'sub' para generar un submarino");
        System.out.println("Teclee 'exit' para terminar la ejecución");
        while (!line.equalsIgnoreCase("exit")){
            line = input.nextLine();
            
            switch (line) {
                case "car":
                case "sub":
                case "heli": 
                    System.out.println("Creando un juguete...");
                    toys.add(enterprise.produceToy(line));
                    break;
                    
                case "exit" :
                    System.out.println("Recibida orden de cierre.");
                    break;
                    
                default: 
                    System.out.println("No se reconoce el comando.");
            }
        }
        System.out.println("Juguetes construidos: " + toys.stream()
                .map(c -> c.toString())
                .collect(Collectors.joining(", ")));

    }
}
