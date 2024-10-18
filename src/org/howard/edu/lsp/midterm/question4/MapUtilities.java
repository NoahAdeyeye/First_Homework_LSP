package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

public class MapUtilities {
    // This class will return the number of same key/value pairs between two HashMaps
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        if (map1.isEmpty() || map2.isEmpty()) return 0;

        int count = 0;
        for (String key : map1.keySet()) {
            if (map2.containsKey(key) && map2.get(key).equals(map1.get(key))) {
                count++;
            }
        }
        return count;
    }
}


