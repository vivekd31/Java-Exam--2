/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixquestion;

import java.util.Scanner;

/**
 *
 * @author Vivek Drakshapally
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);

        float side1, side2, side3;
        String color;
        boolean isFilled;

        System.out.println("solution for question6: Vivek Drakshapally");
        System.out.print("Enter the three sides:");
        side1 = s.nextFloat();
        side2 = s.nextFloat();
        side3 = s.nextFloat();
        System.out.println("\nEnter the color:");
       
        

        color = s.next();
         System.out.println("\nIs triangle filled:");
        isFilled = s.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3, color, isFilled);

        System.out.println(triangle.toString());
    }
}

