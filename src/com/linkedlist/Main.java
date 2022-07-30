package com.linkedlist;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main (String[] args) {

        // Both using part of Java collection framework, List interface

        // Linked List Pointer To previous and next node
        LinkedList<String> nameLinkedList = new LinkedList<>();
        nameLinkedList.add("John");
        nameLinkedList.add("Abi");
        nameLinkedList.add("Jenny");
        nameLinkedList.add("Jack");

        // Get Element
        System.out.println(nameLinkedList.get(2));

        // Insert Element At I Index
        // Find specific node at index change its prev and next pointer : LOW PROCESS POWER
        nameLinkedList.add(1, "Jerry");


        ArrayList<String> nameArrayList = new ArrayList<>();
        nameArrayList.add("John");
        nameArrayList.add("Abi");
        nameArrayList.add("Jenny");
        nameArrayList.add("Jack");

        // Get Element
        System.out.println(nameLinkedList.get(2));

        // Insert Element At I Index
        // Recreate New Array And Insert Jerry : HIGH PROCESS POWER
        nameLinkedList.add(1, "Jerry");


        // CONCLUSION
        // USE ArrayList when you aim to create a constant list that use for retrieving element mainly
        // USE LinkedList when you aim to create list that will keep adding and removing element
    }

}
