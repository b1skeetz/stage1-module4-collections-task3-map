package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] words = sentence.split("\\P{L}+");
        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            int counter = 0;
            for (String s : words) {
                if (word.equalsIgnoreCase(s)) {
                    counter++;
                }
            }
            result.put(word.toLowerCase(), counter);
        }
        return result;
    }
}