package factories;

import toyProduct.Toy;

public abstract class ToyFactory {
    final protected SerialNumberGenerator generator = new SerialNumberGenerator();
    public Toy produceToy (String toyType){
        Toy toy = this.createToy(toyType);
        toy.pack();
        toy.label();
        return toy;
    }
   
    protected abstract Toy createToy (String toyType);
}
