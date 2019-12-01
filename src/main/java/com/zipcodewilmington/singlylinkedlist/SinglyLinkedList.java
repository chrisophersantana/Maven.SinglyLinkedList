package com.zipcodewilmington.singlylinkedlist;

import java.security.Key;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    Node head;


    public class Node {
        int data;
        Node next;


        public Node(int d) {
            data = d;
            next = null;

        }
    }

    public SinglyLinkedList add(SinglyLinkedList list, int data) {
        Node noder = new Node(data);
        noder.next = null;

        if (list.head == null) {
            list.head = noder;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = noder;
        }
        return list;
    }

    public void printList(SinglyLinkedList list) {
        Node currNode = list.head;
        System.out.print("SinglyLinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;

        }

    }

    public SinglyLinkedList deleter(SinglyLinkedList list, int key) {

        Node currNode = list.head, prev = null;

        if (key == 0 && currNode != null) {
            list.head = currNode.next;
        }





            if (currNode != null && currNode.data == key) {
                list.head = currNode.next;
            }


            while (currNode != null && currNode.data != key) {
                prev = currNode;
                currNode = currNode.next;

            }

            if (currNode != null) {
                prev.next = currNode.next;
            }

            if (currNode == null) {
                System.out.print(key + " not found");
            }
            return list;
        }
    }
}