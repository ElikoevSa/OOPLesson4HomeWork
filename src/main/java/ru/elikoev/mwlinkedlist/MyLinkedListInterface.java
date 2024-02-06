package ru.elikoev.mwlinkedlist;

import java.util.List;

public interface MyLinkedListInterface <E>{

    void insertAtBeginning(E data);

    void insertAtEnd(E data);

    int getSize();

    E get(int index);

    List<E> getAllElements();

    void addInIndex(int index, E data);
}
