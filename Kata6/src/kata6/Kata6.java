package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import toys.Car;
import toys.SerialNumberGenerator;
/**
 * @author Marcos del Cristo Díaz Gil
 * Ingeniería del Software 2, Universidad de Las Palmas de Gran Canaria
 */
public class Kata6 {

    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        
        String line = "";
        Scanner input = new Scanner(System.in);
        
        System.out.println("CLI de la Juguetera Díaz");
        System.out.println("Teclee EXIT para salir");
        while (!line.equalsIgnoreCase("exit")){
            line = input.nextLine();
            System.out.println("Construcción de coches: " + line);
            if (!line.equalsIgnoreCase("EXIT")){
                Car car = new Car(generator.next());
                car.pack();
                car.label();
                System.out.println("Sale un coche con número: " 
                        + car.getSerialNumber());

            }
        }
    }
}
