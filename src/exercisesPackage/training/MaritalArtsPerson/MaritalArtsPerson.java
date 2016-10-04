package exercisesPackage.training.MaritalArtsPerson;

import java.util.Random;

/**
 * Created by Oleksii on 04.10.2016.
 */
public abstract class MaritalArtsPerson implements Jumpable{
    protected boolean isDefeated = false;
    protected String artPerson;

    @Override
    public void jump() {
        Random r = new Random();
        if(r.nextBoolean()){
            System.out.println(this.artPerson + " successfully dodged by jump.\n");
        } else {
            this.isDefeated = true;
            System.out.println(this.artPerson + " is defeated.\n");
        }
    }

    public void isKicked(){
        System.out.println(this.artPerson + " has been kicked!");
        this.jump();
    }

    public abstract void performTechnique();
}
