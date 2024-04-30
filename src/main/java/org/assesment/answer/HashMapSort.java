package org.assesment.answer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapSort {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("key1", 9);
        map.put("key2", -1);
        map.put("key3", 3);
        map.put("key4", 7);
        map.put("key5", 3);

        Map<String, Integer> sorted = map.entrySet()
                .stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));

        sorted.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
    }
}
