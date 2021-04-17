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
public class Staff extends Employee {
    private String title;

    public Staff(String title) {
        this.title = title;
    }

    public Staff( String title, String office, float salary, Date hiredAt, String name, String address, String phone, String email) {
        super(office, salary, hiredAt, name, address, phone, email);
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
       return "\n\t\"name\" : " + super.getName();
    }
}

