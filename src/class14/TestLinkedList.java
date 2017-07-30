/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class14;

import class9.Dog;

/**
 *
 * @author shahzad
 */
public class TestLinkedList {

    public static void main(String[] args) {
        MyLinkList<String> list = new MyLinkList<>("one");
        list.addItem("two");
        list.addItems(new String[]{"three", "four"});
        list.addItem("five");
//        System.out.println(list);

        MyLinkList<Integer> intList = new MyLinkList<>(1);
        intList.addItem(2);
        intList.addItems(new Integer[]{2, 3, 4, 5, 6, 7});
//        System.out.println(intList);

        MyLinkList<Dog> dogList = new MyLinkList<>(new Dog());
//        System.out.println(dogList);

        // Multiple 
        MyLinkList<MyLinkList<String>> doubleList
                = new MyLinkList<>();
        doubleList.addItem(list);

        // multi - limit 
        MyLinkList<MyLinkList<MyLinkList<MyLinkList<String>>>> mList
                = new MyLinkList<>();

        MyLinkList<?>[] array = {list, intList, dogList, doubleList, mList};
        for (MyLinkList<?> a : array) {
            print(a);
        }
    }

    public static void print(MyLinkList<?> a) {
        System.out.println(a);
    }
}
