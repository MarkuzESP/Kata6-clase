package toys;

public class Helicopter {
    final private Integer serialNumber;
    final String type = "helicóptero";

    public Helicopter(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getType() {
        return type;
    }
    
    public void pack(){
        System.out.printf("Empaquetando '%s' '%d'\n", this.type, this.serialNumber);
    }
    
    public void label(){
        System.out.printf("Etiquetando '%s' '%d'\n", this.type, this.serialNumber);
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }
    
    
}
