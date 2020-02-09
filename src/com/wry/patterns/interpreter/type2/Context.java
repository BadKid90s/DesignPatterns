package com.wry.patterns.interpreter.type2;

import java.util.HashMap;

public class Context {
    private HashMap<String, Integer> map = new HashMap<>();

    public void assign(String key, Integer value) {
      map.put(key,value);
    }

    public Integer lookup(String key) {
       return map.get(key);
    }
}
