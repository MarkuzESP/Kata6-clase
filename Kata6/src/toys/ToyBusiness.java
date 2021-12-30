package toys;

import toyProduct.Toy;
import toyProduct.models.CarToy;
import toyProduct.models.HelicopterToy;

public class ToyBusiness {
    final private SerialNumberGenerator generator = new SerialNumberGenerator();

    public Toy createToy(String toyType){
        switch(toyType){
            case "car":
                CarToy car = new CarToy(this.generator.next());
                car.pack();
                car.label();
                return car;
                
            case "heli":
                HelicopterToy heli = new HelicopterToy(this.generator.next());
                heli.pack();
                heli.label();
                return heli;
                
            default:
                return null;
        }
    }
}