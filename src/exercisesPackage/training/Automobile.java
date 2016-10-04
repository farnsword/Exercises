package exercisesPackage.training;

/**
 * Created by Oleksii on 29.09.2016.
 */
public class Automobile {
    private String brand;
    private double engineVolume;
    private boolean isBita;


    public Automobile(){
        this.brand = "Opel";
        this.engineVolume = 3.0d;
        this.isBita = false;
    }


    public boolean isBita() {
        return isBita;
    }

    public String getBrand() {
        return brand;
    }

    public double getEngineVolume() {
        return engineVolume;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void crash() {
        this.isBita = true;
    }

    public String whatIsTheCar(){
        return "The car is: brand - " + brand + ", engine volume - " + engineVolume + ", crashed - " + (isBita?"Yes":"No");
    }

}
