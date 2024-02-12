package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] words = sentence.split("[, ]");
        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            int counter = 0;
            for (int j = 1; j < words.length; j++) {
                if (word.equals(words[j])) {
                    counter++;
                }
            }
            result.put(word, counter);
        }
        return result;
    }
}
