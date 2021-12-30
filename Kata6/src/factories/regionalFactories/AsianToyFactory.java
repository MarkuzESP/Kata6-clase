package factories.regionalFactories;

import factories.ToyFactory;
import toyProduct.Toy;
import toyProduct.models.AsianCarToy;
import toyProduct.models.AsianHelicopterToy;

public class AsianToyFactory extends ToyFactory{

    @Override
    public Toy createToy(String toyType) {
        switch(toyType){
            case "car":
                AsianCarToy car = new AsianCarToy(this.generator.next());
                return car;
                
            case "heli":
                AsianHelicopterToy heli = new AsianHelicopterToy(this.generator.next());
                return heli;
                
            default:
                return null;
        }
    }
    
}
