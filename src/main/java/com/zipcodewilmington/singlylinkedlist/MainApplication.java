package com.zipcodewilmington.singlylinkedlist;

import static jdk.internal.org.objectweb.asm.util.Printer.printList;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {
    public void main(String [] args){
        SinglyLinkedList list = new SinglyLinkedList();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        printList(list);



    }

    private void printList(SinglyLinkedList list) {
    }

    private SinglyLinkedList insert(SinglyLinkedList list, int i) {
        return list;
    }
}
