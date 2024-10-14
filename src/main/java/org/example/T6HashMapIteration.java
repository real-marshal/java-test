package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class T6HashMapIteration {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("a", 0);
        map.put("b", 1);
        map.put("c", 2);

            Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
