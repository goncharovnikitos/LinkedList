package com.company;
import  java.util.LinkedList;
public class Main {

    public static void main(String[] args) {

        ListLink list = new ListLink();
        // Creating a linked list

       /* list.addToTheLast(new Node(5));
        list.addToTheLast(new Node(6));
        list.addToTheLast(new Node(7));
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));
        list.printList();*/

        Node loopNode=new Node(7);
        list.addToTheLast(new Node(5));
        list.addToTheLast(new Node(6));
        list.addToTheLast(loopNode);
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));

        list.printList();
        // creating a loop
        list.addToTheLast(loopNode);

        // Test if loop existed or not
        System.out.println("Loop existed-->" + list.ifLoopExists());
    }


}


