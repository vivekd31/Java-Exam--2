/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fivequestion;

import java.util.Date;

/**
 *
 * @author Vivek Drakshapally
 */
public class Faculty extends Employee {
    private String hours;

    private int noOfSubjects;

    public Faculty(){

    }

    public Faculty(String hours, int noOfSubjects, String office, float salary, Date hiredAt, String name, String address, String phone, String email) {
        super(office, salary, hiredAt, name, address, phone, email);
        this.hours = hours;
        this.noOfSubjects = noOfSubjects;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public int getNoOfSubjects() {
        return noOfSubjects;
    }

    public void setNoOfSubjects(int noOfSubjects) {
        this.noOfSubjects = noOfSubjects;
    }

    public String toString() {
        return "\n\t\"name\" : " + super.getName();
    }
}
