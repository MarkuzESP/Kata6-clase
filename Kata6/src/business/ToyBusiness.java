package business;

import factories.SerialNumberGenerator;
import factories.ToyFactory;
import toyProduct.Toy;

public class ToyBusiness {
    private final ToyFactory factory;

    public ToyBusiness(ToyFactory factory) {
        this.factory = factory;
    }
    
    public Toy produceToy(String toyType){
        return this.factory.produceToy(toyType);
    }
    
}