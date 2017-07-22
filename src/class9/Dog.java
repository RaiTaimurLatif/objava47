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
public class Dog extends AbstractAnimal implements BreedInterface {

    String breed;
    public static long objectCounter ;

    public Dog() {
        this("Unknown");
    }

    public Dog(String breed) {
        super("Dog");
        this.breed = breed;
        objectCounter ++ ;
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
        AbstractAnimal a = new Dog("Indian");
        AbstractAnimal b = new Cat("American");
        // Anonymous Class = Adapter 
        AbstractAnimal e = new AbstractAnimal("Duck") {
            @Override
            public String sound() {
                return "Quak Quak ... ";
            }

            @Override
            public String color() {
                return "White";
            }
        };
        AbstractAnimal h = new AbstractAnimal("Horse") {
            @Override
            public String sound() {
                return "Eehhheee ... ";
            }

            @Override
            public String color() {
                return "Brown";
            }
        };

//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
        AbstractAnimal[] ar = {a, b, c, d, e, h};
        for (AbstractAnimal aa : ar) {
            System.out.println(aa.type + "====" + aa.sound() + "==" + aa.color());
        }
    }

    @Override
    public String color() {
        return "Black";
    }

    @Override
    public String breed() {
        return this.breed ;
    }

}
