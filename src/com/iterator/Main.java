package com.iterator;

import java.util.*;

public class Main {
    public static void main(String[] args){

        // CREATING ITERATOR FROM ARRAYLIST
        ArrayList<String> names = new ArrayList<String>();
        names.add("Christine");
        names.add("Sarah");
        names.add("James");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next(); // iterator.next can only be called one time per loop
            if (name == "Sarah") {
                iterator.remove();
                System.out.println(name + " had been removed");
            } else {
                System.out.println(name);
            }
        }

        // ITERATOR FROM HASHSET
        Set<String> set = new HashSet<>();
        set.add("Jane");
        set.add("Jacob");
        set.add("Hannah");

        Iterator<String> iterator2 = set.iterator();

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        // ITERATOR FROM HASHMAP
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("Jack", "Verbose");
        hm.put("Jessy", "Stone");

        Iterator<String> keyIterator = hm.keySet().iterator();
        Iterator<String> valueIterator = hm.keySet().iterator();

        Iterator<Map.Entry<String, String >> entryIterator = hm.entrySet().iterator();

    }
}
