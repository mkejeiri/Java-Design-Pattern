package com.java.course.iterator;
public interface Iterator<T> {
    boolean hasNext();
    T next();
    void remove();
}
