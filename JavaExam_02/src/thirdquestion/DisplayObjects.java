/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdquestion;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Vivek Drakshapally
 */
public class DisplayObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Solution for Third Question: Vivek Drakshapally");
        ArrayList<Object> ls = new ArrayList<Object>();

        Loan loan = new Loan(6.4f, 30000, "Vivek");

        ls.add(loan);

        Date date = new Date();
        ls.add(date);
        String place = "hyderabad";
        ls.add(place);
        Circle circle = new Circle(1, 3.14);
        ls.add(circle);

        for (Object Object : ls) {
            System.out.println(Object.toString());
        }
    }

}

class Loan {

    private float interest;

    private int amount;

    private String name;

    public Loan() {

    }

    public Loan(float interest, int amount, String name) {
        this.interest = interest;
        this.amount = amount;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public float getInterest() {
        return this.interest;
    }

    public void seAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public String toString() {
        return "\n\"name\" : " + this.name + ",\n\"amount\" : " + this.amount + ",\n\"interest\" : " + this.interest + "\n";
    }
}

class Circle {

    private float radius;

    private double area;

    public Circle() {

    }

    public Circle(float radius, double area) {
        this.radius = radius;
        this.area = area;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return this.radius;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return this.area;
    }

    public String toString() {
        return "\n\"radius\" : " + this.radius + ",\n\"area\" : " + this.area + "\n";
    }

}
