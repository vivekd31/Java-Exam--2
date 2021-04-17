/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixquestion;

/**
 *
 * @author Vivek Drakshapally
 */
public class Triangle extends GeometricObject{
    private float side1;

    private float side2;

    private float side3;

    public Triangle() {
    }

    public Triangle(float side1, float side2, float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(float side1, float side2, float side3, String color, boolean isFilled) {
        super(color, isFilled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public double getArea() {
        float s=(side1+side2+side3)/2;
        return Math.sqrt(s * (s- side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "area : " + getArea() + ",\nperimeter : " + getPerimeter() + ",\ncolor : " + super.getColor() +  ",\nisFilled : " + super.isFilled() + "\n";
    }
}
