package exercisesPackage.training.MaritalArtsPerson;

/**
 * Created by Oleksii on 04.10.2016.
 */
public class Aikidoka extends MaritalArtsPerson {
    @Override
    public void performTechnique() {
        System.out.println("Aikidoka performs standard koshi-nage");
    }


     public void performTechnic(String technic){
         System.out.println("Aikidoka perforrms " + technic);
     }

     public void performTechnic(String technic_1, String technic_2){
         System.out.println("Aikidoka performs " + technic_1 + " and " + technic_2);
     }
}
