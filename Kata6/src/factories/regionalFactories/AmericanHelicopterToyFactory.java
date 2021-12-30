package factories.regionalFactories;

import factories.ToyFactory;
import toyProduct.Toy;
import toyProduct.models.AmericanHelicopterToy;

public class AmericanHelicopterToyFactory extends ToyFactory {

    @Override
    public Toy createToy(Integer serialNumber) {
        return new AmericanHelicopterToy(serialNumber);
    }
}
