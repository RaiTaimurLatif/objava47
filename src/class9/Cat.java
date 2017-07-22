/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class9;

/**
 *
 * @author shahzad
 */
public class Cat extends AbstractAnimal {

    String breed;

    public Cat() {
        this("Unknown");
    }

    public Cat(String breed) {
        super("Cat");
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" + "breed=" + breed + '}' + "-" + super.toString();
    }

    @Override
    public String sound() {
        return "Meeeaaauuuwwww ... ";
    }

    @Override
    public String color() {
        return "Blue ... ";
    }

}
