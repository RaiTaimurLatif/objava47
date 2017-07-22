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
public abstract class AbstractAnimal implements AnimalColor{
   String type;

    public AbstractAnimal() {
        this("Unknown");
    }

    public AbstractAnimal(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" + "type=" + type + '}';
    }

    public abstract String sound() ;
 
}
