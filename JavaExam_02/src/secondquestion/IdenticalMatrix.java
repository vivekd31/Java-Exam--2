/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondquestion;

import java.util.Scanner;

/**
 *
 * @author Vivek Drakshapally
 */
public class IdenticalMatrix {
    public static void main(String[] args){
        Scanner ser = new Scanner(System.in);
        
        int n;
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        
        System.out.println("Solution for Second Question:Vivek Drakshapally");
        System.out.print("Enter list1: ");
        for(int row=0; row < 3; row++) {
            for(int column = 0; column < 3; column++) {
                n = ser.nextInt();
                matrix1[row][column] = n;
            }
        }

        System.out.println();

        System.out.print("Enter list2: ");
        for(int row=0; row < 3; row++) {
            for(int column = 0; column < 3; column++) {
                n = ser.nextInt();
                matrix2[row][column] = n;
            }
        }

        if(equals(matrix1,matrix2)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }

    }

    public static boolean equals(int[][] m1, int[][] m2){

        for(int row  = 0; row < m1.length; row++) {
            for(int column = 0; column < m1[row].length; column++) {
                if(m1[row][column] != m2[row][column]) {
                    return false;
                }
            }
        }
        return true;
    }
}
