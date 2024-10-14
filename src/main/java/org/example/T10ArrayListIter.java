package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class T10ArrayListIter {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (String item : list) {
            System.out.println(item);
        }
    }
}
