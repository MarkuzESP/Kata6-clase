package factories.regionalFactories;

import factories.ToyFactory;
import toyProduct.Toy;
import toyProduct.models.AsianHelicopterToy;

public class AsianHelicopterToyFactory extends ToyFactory{

    @Override
    public Toy createToy(Integer serialNumber) {
        return new AsianHelicopterToy(serialNumber);
    }
}
