package com.arrayandlist;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Array (Fixed Size)
        String[] friendsArray = new String[4];
        String[] friendsArray2 = {"Bob", "Jacob", "Jean", "Jack"};

        // Array List
        ArrayList<String> friendsArrayList = new ArrayList<>();
        ArrayList<Integer> intArrayList = new ArrayList<>();
        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));

        // Getting Value From Each
        System.out.println(friendsArray2[1]);
        System.out.println(friendsArrayList2.get(1));

        // Check Array Length
        System.out.println(friendsArray2.length);
        System.out.println(friendsArrayList2.size());

        // Add Value/Element To The End Of Array
        // Cannot do it with ARRAY
        friendsArrayList.add("Mikey");

        // Set An Element At Index I
        friendsArray2[0] = "Carl";
        friendsArrayList2.set(0, "Carl");
    }
}
