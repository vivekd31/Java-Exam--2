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
public class Employee extends Person{
    private String office;

    private float salary;

    private Date hiredAt;

    public Employee(){

    }

    public Employee(String office, float salary, Date hiredAt, String name, String address, String phone, String email) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.hiredAt = hiredAt;
    }


    public String getOffice() {
        return this.office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Date getHiredAt() {
        return this.hiredAt;
    }

    public void setHiredAt(Date hiredAt) {
        this.hiredAt = hiredAt;
    }

    @Override
    public String toString() {
        return "\n\t\"name\" : " + super.getName();
    }
}
