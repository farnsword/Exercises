package exercisesPackage.training.MaritalArtsPerson;

/**
 * Created by Oleksii on 04.10.2016.
 */
public class Run {
    public static void main(String[] args) {
        Aikidoka a = new Aikidoka();
        a.artPerson = "Aikidoka";
        Judoka j = new Judoka();
        j.artPerson = "Judoka";
        Karatmen k = new Karatmen();
        k.artPerson = "Karatmen";

        a.isKicked();
        j.isKicked();
        k.isKicked();

        a.performTechnique();
        a.performTechnic("kote-gaeshi");
        a.performTechnic("shiho-nage", "sumi-ottoshi");

        j.performTechnique();

        k.performTechnique();

    }
}
