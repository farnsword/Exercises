package exercisesPackage.training;

import java.util.Scanner;

/**
 * Created by Oleksii on 03.10.2016.
 */
public class Bitworld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int k = sc.nextInt();
        String action;
        for (int i = 0; i < k; i++) {
            action = sc.next();
            if(action == "++x"){
                ++x;
            }else if (action == "x++"){
                x++;
            } else if(action == "x--"){
                x--;
            }else if(action == "--x"){
                --x;
            }
        }
        System.out.println(x);
    }
}
