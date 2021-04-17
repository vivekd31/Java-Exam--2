/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstquestion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vivek Drakshapally
 */
public class removeduplicate {

    public static void main(String args[]) {
        System.out.println("Solution for firstquestion: Vivek Drakshapally");
        ArrayList<Integer> viv = new ArrayList<>();
        Scanner scer = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            viv.add(scer.nextInt());
        }
        removeDuplicate(viv);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> drak = new ArrayList<>();
        for (Integer vi : list) {
            if (!drak.contains(vi)) {
                drak.add(vi);
            }
        }
        System.out.print("The distinct integers are ");
        for (Integer t : drak) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
