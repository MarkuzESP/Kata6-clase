package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Helicopter;
import toys.Car;
import toys.SerialNumberGenerator;
/**
 * @author Marcos del Cristo Díaz Gil
 * Ingeniería del Software 2, Universidad de Las Palmas de Gran Canaria
 */
public class Kata6 {

    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        ArrayList<Car> carList = new ArrayList<>();
        ArrayList<Helicopter> heliList = new ArrayList<>();
        
        String line = "";
        Scanner input = new Scanner(System.in);
        
        System.out.println("CLI de la Juguetera Díaz");
        System.out.println("Teclee Car para generar un coche, Helicopter para generar un helicóptero");
        System.out.println("Teclee EXIT para terminar la ejecución");
        while (!line.equalsIgnoreCase("exit")){
            line = input.nextLine();
            
            switch (line) {
                case "car":
                    System.out.println("Construcción de coches: ");
                    Car car = new Car(generator.next());
                    car.pack();
                    car.label();
                    carList.add(car);
                    break;
                
                case "helicopter": 
                    System.out.println("Construcción de helicópteros: ");
                    Helicopter heli = new Helicopter(generator.next());
                    heli.pack();
                    heli.label();
                    heliList.add(heli);
                    break;
                    
                case "exit":
                    System.out.println("Recibida orden de cierre");
                    break;
                    
                default: 
                    System.out.println("No se reconoce el comando");
            }
        }
        System.out.println("Coches construidos: " + carList.stream()
                        .map(c -> c.getSerialNumber().toString())
                        .collect(Collectors.joining(", ")));
        
        System.out.println("Helicópteros construidos: " + heliList.stream()
                        .map(h -> h.getSerialNumber().toString())
                        .collect(Collectors.joining(", ")));
    }
}
