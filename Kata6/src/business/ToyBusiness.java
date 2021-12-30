package business;

import factories.SerialNumberGenerator;
import factories.ToyFactory;
import java.util.HashMap;
import java.util.Map;
import toyProduct.Toy;

public class ToyBusiness {
    private final Map<String, ToyFactory> toyFactories = new HashMap<>();
    final private SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public void add (String name, ToyFactory factory){
        this.toyFactories.put(name, factory);
    }

    public Toy produceToy(String toyType){
        return this.toyFactories.get(toyType).produceToy(this.generator.next());
    }
    
}