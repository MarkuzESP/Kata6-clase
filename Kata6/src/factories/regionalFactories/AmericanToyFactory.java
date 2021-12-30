package factories.regionalFactories;

import factories.ToyFactory;
import toyProduct.Toy;
import toyProduct.models.AmericanCarToy;
import toyProduct.models.AmericanHelicopterToy;

public class AmericanToyFactory extends ToyFactory {

    @Override
    public Toy createToy(String toyType) {
        switch(toyType){
            case "car":
                AmericanCarToy car = new AmericanCarToy(this.generator.next());
                return car;
                
            case "heli":
                AmericanHelicopterToy heli = new AmericanHelicopterToy(this.generator.next());
                return heli;
                
            default:
                return null;
        }
    }
}
