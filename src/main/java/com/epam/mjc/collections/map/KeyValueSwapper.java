package com.epam.mjc.collections.map;

import java.util.*;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();
        List<String> buffer = new ArrayList<>();
        for (Map.Entry<Integer, String> e : sourceMap.entrySet()) {
            buffer.add(e.getKey().toString());
            buffer.add(e.getValue());
        }
        for (int i = 1; i < buffer.size(); i += 2) {
            for (int j = i; j < buffer.size(); j += 2) {
                if (buffer.get(i).equals(buffer.get(j))) {
                    int num1 = Integer.parseInt(buffer.get(i - 1));
                    int num2 = Integer.parseInt(buffer.get(j - 1));
                    if (num1 > num2) {
                        buffer.remove(i);
                        buffer.remove(i - 1);
                    } else if (num2 > num1) {
                        buffer.remove(j);
                        buffer.remove(j - 1);
                    }
                }
            }
        }
        for(int i = 1; i < buffer.size(); i+=2){
            result.put(buffer.get(i), Integer.parseInt(buffer.get(i-1)));
        }

        return result;
    }
}