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
public class Dog extends Animal {

    String breed;

    public Dog() {
        this("Unknown");
    }

    public Dog(String breed) {
        super("Dog");
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" + "breed=" + breed + '}' + "-" + super.toString();
    }

    @Override
    public String sound() {
        return "Bark Bark ... ";
    }

    public static void main(String[] args) {
        Dog d = new Dog("BullDog");
        Cat c = new Cat("Persian");
        Animal a = new Dog("Indian");
        Animal b = new Cat("American");
        Animal e = new Animal("Duck");

//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
        Animal[] ar = {a, b, c, d, e};
        for (Animal aa : ar) {
            System.out.println(aa.type + "====" + aa.sound());
        }
    }

}
