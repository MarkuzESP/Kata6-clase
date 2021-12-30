package factories.regionalFactories;

import factories.ToyFactory;
import toyProduct.Toy;
import toyProduct.models.EuropeanSubmarineToy;

public class EuropeanSubmarineToyFactory extends ToyFactory {
    
    @Override
    public Toy createToy(Integer serialNumber) {
        return new EuropeanSubmarineToy(serialNumber);
    }
}
