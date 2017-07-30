/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class13;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author shahzad
 */
public class Student implements Observer {

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("This change belongs to : "
                + ((Teacher) o).getStudentName() + "[" + this.name + "]");
    }

    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", email=" + email + '}';
    }

}
