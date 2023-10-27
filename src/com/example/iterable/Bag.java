package com.example.iterable;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;

public class Bag<T> implements Container<T> {

    public Bag() {
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 5;
    }

    @Override
    public void add(Object item) {

    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        Container.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Container.super.spliterator();
    }
}
