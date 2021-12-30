package business;

import toyProduct.Toy;

public abstract class ToyBusiness {
    final protected SerialNumberGenerator generator = new SerialNumberGenerator();
    public abstract Toy createToy(String toyType);

}