package exercisesPackage.training;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Oleksii on 29.09.2016.
 */
public class ReadWrite {
    public static void main(String[] args) {

        String textFromFile = "";
        try(Scanner in = new Scanner(new File("C:\\Users\\Oleksii\\IdeaProjects\\Exercises_O\\INPUT.txt"))) {
            while (in.hasNext()) {
                textFromFile += in.nextLine() + "\r\n";
            }
            in.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println(textFromFile);




        BufferedWriter bw = null;
        try{
            File outputFile = new File("C:\\Users\\Oleksii\\IdeaProjects\\Exercises_O\\OUTPUT.txt");
            FileWriter fw = new FileWriter(outputFile);
            bw = new BufferedWriter(fw);
            bw.write(textFromFile);
        } catch(IOException e){
            e.printStackTrace();
        } finally {
            try{
                if(bw!=null)
                    bw.close();
            }catch(Exception ex){
                System.out.println("Error in closing the BufferedWriter"+ex);
            }
        }
    }
}
