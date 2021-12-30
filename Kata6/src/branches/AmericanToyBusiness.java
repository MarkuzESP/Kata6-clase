package branches;

import business.ToyBusiness;
import toyProduct.Toy;
import toyProduct.models.AmericanCarToy;
import toyProduct.models.AmericanHelicopterToy;

public class AmericanToyBusiness extends ToyBusiness {

    @Override
    public Toy createToy(String toyType) {
        switch(toyType){
            case "car":
                AmericanCarToy car = new AmericanCarToy(this.generator.next());
                car.pack();
                car.label();
                return car;
                
            case "heli":
                AmericanHelicopterToy heli = new AmericanHelicopterToy(this.generator.next());
                heli.pack();
                heli.label();
                return heli;
                
            default:
                return null;
        }
    }
}
