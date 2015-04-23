/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise13_08;

import java.util.ArrayList;

/**
 *
 * @author Runyu Wang
 */
public class MyStack implements Cloneable {

    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return 0;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "stack:" + list.toString();
    }

    @Override
    public Object clone() {
        try {
            MyStack c = (MyStack) super.clone();
            //c.list = (ArrayList<Object>) this.list.clone();
            return c;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}
