package exercisesPackage.training;

/**
 * Created by Oleksii on 29.09.2016.
 */
public class Building {
    private String type;
    private int floorsNumber;
    private int flatsNumber;

    public Building(){
        this.type = "Сталинка";
        this.flatsNumber = 45;
        this.floorsNumber = 9;
    }

    public String getType() {
        return type;
    }
    public int getFloorsNumber() {
        return floorsNumber;
    }
    public int getFlatsNumber() {
        return flatsNumber;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }
    public void setFlatsNumber(int flatsNumber) {
        this.flatsNumber = flatsNumber;
    }

    public void printSummary(){
        System.out.println(this.getType() + " c " + this.getFloorsNumber() + " этажами и " + this.getFlatsNumber() + " квартирами.");

    }
}
