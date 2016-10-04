package exercisesPackage.training;

/**
 * Created by Oleksii on 29.09.2016.
 */
public class BuildingProgram {
    public static void main(String[] args) {
        Building house = new Building();
        house.printSummary();

        house.setType("Хрущевка");
        house.setFloorsNumber(5);
        house.setFlatsNumber(20);

        house.printSummary();
    }
}
