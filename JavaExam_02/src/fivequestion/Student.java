/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fivequestion;

/**
 *
 * @author Vivek Drakshapally
 */
public class Student extends Person {
    private String grade;

    private final String status = "Graduate";

    public Student(String grade) {
        this.grade = grade;
    }

    public Student(String grade, String name, String address, String phone, String email) {
        super(name, address, phone, email);
        this.grade = grade;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getStatus() {
        return this.status;
    }

    public String toString() {
        return "\n\t\"name\" : " + super.getName();
    }
}
