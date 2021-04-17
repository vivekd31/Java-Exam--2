/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fivequestion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
       try {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Person person = new Person("Ramu", "2-189, alvin colony hyderabad", "9328384736", "ramu@gmail.com");
            Student student = new Student("A", "Ram", "2-173 alvin colony hyderabad", "9120837462", "ram@gmail.com");

            Employee employee = new Employee("Microsoft", 30000.00f, dateFormat.parse("03/04/2019"), "Nikhil", "3-120 alvin colony hyderabad", "9223912876", "nikhil@gmail.com");
            Faculty faculty = new Faculty("8 hours", 3, "JNTU", 300000.0f, dateFormat.parse("05/03/2016"), "Rakesh", "4-89 alvin colony hyderabad", "8330028432", "rakesh@gmail.com");
            Staff staff = new Staff("Teacher", "JNTU", 300000.00f, dateFormat.parse("01/02/2005"), "Kamal", "5-24 alvin colony hyderabad", "9320734321", "kamal@gmail.com");

            System.out.println("Person: " + person.toString());
            System.out.println("Student: " + student.toString());
            System.out.println("Employee: " + employee.toString());
            System.out.println("Faculty: " + faculty.toString());
            System.out.println("Staff: " + staff.toString());
        } catch (Exception e) {
            System.out.println("Error formatting date");
        }
    }
}

