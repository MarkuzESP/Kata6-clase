package branches;

import business.ToyBusiness;
import toyProduct.Toy;
import toyProduct.models.AsianCarToy;
import toyProduct.models.AsianHelicopterToy;

public class AsianToyBusiness extends ToyBusiness{

    @Override
    public Toy createToy(String toyType) {
        switch(toyType){
            case "car":
                AsianCarToy car = new AsianCarToy(this.generator.next());
                car.pack();
                car.label();
                return car;
                
            case "heli":
                AsianHelicopterToy heli = new AsianHelicopterToy(this.generator.next());
                heli.pack();
                heli.label();
                return heli;
                
            default:
                return null;
        }
    }
    
}
