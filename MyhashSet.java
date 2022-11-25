package com.company;

import java.util.HashMap;
import java.util.Iterator;

import static java.util.Objects.hash;
public class MyhashSet <E>  {
    private transient HashMap<E,Object> map;
    private static final Object PRESENT = new Object();


    public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }

    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    public int size() {
        return map.size();
    }

    public boolean remove(Object o) {
        return map.remove(o)==PRESENT;
    }

}
