package exercisesPackage;

/**
 * Created by Oleksii on 22.09.2016.
 */
public class Triangle {

    public static void main(String[] args) {
        int a = 5, b = 0, c = 10;

        if (!triangleExistance(a, b, c)) {
            System.out.println("Triangle doesn`t exist");
        } else {
            System.out.println("Triangle exist");
        }
    }

    public static boolean triangleExistance(int x, int y, int z) {
        boolean result = true;
        if (x + y <= z) {
            result = false;
        }
        if (y + z <= x) {
            result = false;
        }
        if (x + z <= y) {
            result = false;
        }
            return result;
    }

}
