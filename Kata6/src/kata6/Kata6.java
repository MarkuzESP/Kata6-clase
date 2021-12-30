package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Helicopter;
import toys.Car;
import toys.SerialNumberGenerator;
import toys.ToyBusiness;
/**
 * @author Marcos del Cristo Díaz Gil
 * Ingeniería del Software 2, Universidad de Las Palmas de Gran Canaria
 */
public class Kata6 {

    public static void main(String[] args) {
        ToyBusiness enterprise = new ToyBusiness();
        ArrayList<Car> carList = new ArrayList<>();
        ArrayList<Helicopter> heliList = new ArrayList<>();
        
        String line = "";
        Scanner input = new Scanner(System.in);
        
        System.out.println("CLI de la Juguetera Díaz");
        System.out.println("Teclee 'car' para generar un coche, 'heli' para generar un helicóptero");
        System.out.println("Teclee 'exit' para terminar la ejecución");
        while (!line.equalsIgnoreCase("exit")){
            line = input.nextLine();
            
            switch (line) {
                case "car":
                    System.out.println("Creando un coche...");
                    carList.add(enterprise.createCar());
                    break;
                
                case "heli": 
                    System.out.println("Creando un helicóptero...");
                    heliList.add(enterprise.createHeli());
                    break;
                    
                case "exit" :
                    System.out.println("Recibida orden de cierre.");
                    break;
                    
                default: 
                    System.out.println("No se reconoce el comando.");
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
