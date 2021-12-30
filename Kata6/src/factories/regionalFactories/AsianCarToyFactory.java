package factories.regionalFactories;

import factories.ToyFactory;
import toyProduct.Toy;
import toyProduct.models.AsianCarToy;

public class AsianCarToyFactory extends ToyFactory{

    @Override
    public Toy createToy(Integer serialNumber) {
        return new AsianCarToy(serialNumber);
    }
}
