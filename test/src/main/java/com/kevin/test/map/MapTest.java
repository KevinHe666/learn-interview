package com.kevin.test.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2019-12-31 15:56
 */
public class MapTest {
    public static void main(String[] args) {
        final HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        final Hashtable<Object, Object> objectObjectHashtable = new Hashtable<>();
        final ConcurrentHashMap<Object, Object> objectObjectConcurrentHashMap = new ConcurrentHashMap<>();
        objectObjectConcurrentHashMap.put("1", "1");
        objectObjectConcurrentHashMap.get("1");
    }
}
