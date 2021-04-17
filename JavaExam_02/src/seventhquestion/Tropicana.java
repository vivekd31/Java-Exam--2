/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seventhquestion;

/**
 *
 * @author Vivek Drakshapally
 */
public class Tropicana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Tropicana size is: " + TropicanaSize.SMALL);
        System.out.println("Tropicana Size is: " + TropicanaSize.MEDIUM);
        System.out.println("---------------------------------------------------");
        for (TropicanaSize Tsize : TropicanaSize.values()) {
            System.out.println("Tropicana size is: "+Tsize + " "+"and available in " + Tsize.getLitres()+" Liters");
        }
    }

}
