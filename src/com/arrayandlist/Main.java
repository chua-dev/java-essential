package com.arrayandlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

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

        // Remove An Element
        // Cannot do it with ARRAY
        friendsArrayList2.remove("Chris");
        friendsArrayList2.remove(1);

        // Print Out The Value
        System.out.println(friendsArray2);
        System.out.println(friendsArrayList2);

        // Array List Function
        friendsArrayList2.contains("Chris"); // Contain Value? Return Boolean

        // LOOP Through Each Array
        // For Loop
        for (int i = 0; i < friendsArrayList2.size(); i++) {
            System.out.println(friendsArrayList2.get(i));
        }

        // Advanced For Loop
        for (String name : friendsArrayList2) {
            System.out.println(name);
        }

        // While Loop
        int count = 0;
        while (friendsArrayList2.size() > count) {
            System.out.println(friendsArrayList2.get(count));
            count++;
        }

        // Loop Using Iterator
        Iterator iterator = friendsArrayList2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
