package com.example.linkedlist;

public interface LinkedList<E> {

    void addFirst(E element);
    void addLast(E element);

    E pollFirst();
    E pollLast();

    E peakFirst();
    E peakLast();

    void clear();

    boolean contains(E element);

    int size();
}
