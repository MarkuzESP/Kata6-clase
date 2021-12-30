package toys;

public class ToyBusiness {
    final private SerialNumberGenerator generator = new SerialNumberGenerator();

    public Car createCar(){
        Car car = new Car(this.generator.next());
        car.pack();
        car.label();
        return car;
    }
    
    public Helicopter createHeli(){
        Helicopter heli = new Helicopter(this.generator.next());
        heli.pack();
        heli.label();
        return heli;
    }
}
