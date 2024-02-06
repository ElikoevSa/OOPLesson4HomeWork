package ru.elikoev;

import ru.elikoev.mwlinkedlist.MyLinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MyLinkedList <Integer> list = new MyLinkedList<>();

        list.insertAtBeginning(1);
        list.insertAtEnd(12);
        list.insertAtEnd(233);


        System.out.println(list.getAllElements());
        }
}