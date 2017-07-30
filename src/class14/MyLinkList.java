/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class14;

import class8.Animal;
import java.io.Serializable;

/**
 *
 * @author shahzad
 */
//public class MyLinkList<T extends Animal & Serializable & Cloneable> {
public class MyLinkList<T> {

    ListItem start, end, current;

    public MyLinkList() {
    }

    public MyLinkList(T value) {
        addItem(value);
    }

    public MyLinkList(T[] values) {
        addItems(values);
    }

    public void addItem(T item) {
        ListItem it = new ListItem(item);
        if (start == null) {
            start = end = it;
        } else {
            end.next = it;
            end = it;
        }
    }

    public T getFirst() {
        current = start;
        return current != null ? current.item : null;
    }

    public T getNext() {
        if (current != null) {
            current = current.next;
        }
        return current != null ? current.item : null;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        for (T item = getFirst(); item != null; item = getNext()) {
            buf.append(item);
            buf.append(",");
        }

        return buf.toString();
    }

    public void addItems(T[] values) {
        for (T value : values) {
            addItem(value);
        }
    }

    private class ListItem {

        T item;
        ListItem next;

        public ListItem(T item) {
            this.item = item;
        }

        @Override
        public String toString() {
            return "ListItem{" + "item=" + item + ", next=" + next + '}';
        }
    }
}
