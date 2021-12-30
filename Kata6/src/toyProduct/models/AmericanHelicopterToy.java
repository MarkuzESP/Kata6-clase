package toyProduct.models;

import toyProduct.Toy;

public class AmericanHelicopterToy implements Toy{
    final private Integer serialNumber;
    final String type = "helicóptero";

    public AmericanHelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getType() {
        return type;
    }
    
    @Override
    public void pack(){
        System.out.printf("Empaquetando '%s' '%d'\n",
                this.type, this.serialNumber);
    }
    
    @Override
    public void label(){
        System.out.printf("Etiquetando '%s' '%d'\n",
                this.type, this.serialNumber);
    }

    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "AmericanHelicopterToy{" + "serialNumber=" + serialNumber + '}';
    }
    
    
}
