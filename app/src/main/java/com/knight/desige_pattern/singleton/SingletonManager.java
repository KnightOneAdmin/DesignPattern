package com.knight.desige_pattern.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by knightoneadmin on 2017/3/17.
 */

public class SingletonManager {
    private static Map<String, Objects> objectsMap = new HashMap<>();

    public SingletonManager() {
    }
    private static void registerService(String key, Object instance) {
        if (!objectsMap.containsKey(key)) {
            objectsMap.put(key, (Objects) instance);
        }
    }
    public static Object getService(String key) {
        return objectsMap.get(key);
    }
}
