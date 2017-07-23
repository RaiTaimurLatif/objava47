/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class12;

import java.io.Serializable;

/**
 *
 * @author shahzad
 */
public class Assignment implements Serializable {

    private static long serialVersionUID = 289758978976768234L;

    private Integer id;
    private String name;
    private Float marks;
    private Long testing = 10000L;

    public Assignment(Integer id, String name, Float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Assignment{" + "id=" + id + ", name=" + name + ", marks=" + marks + ", testing=" + testing + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMarks() {
        return marks;
    }

    public void setMarks(Float marks) {
        this.marks = marks;
    }

}
