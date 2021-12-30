package factories.regionalFactories;

import factories.ToyFactory;
import toyProduct.Toy;
import toyProduct.models.AmericanCarToy;

public class AmericanCarToyFactory extends ToyFactory {
    
    @Override
    public Toy createToy(Integer serialNumber) {
        return new AmericanCarToy(serialNumber);
    }
}
