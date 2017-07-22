/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class8;

/**
 *
 * @author shahzad
 */
public class Animal {

    String type;

    public Animal() {
        this("Unknown");
    }

    public Animal(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" + "type=" + type + '}';
    }

    public String sound() {
        return "Don't know ... ";
    }

}
