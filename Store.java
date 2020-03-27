
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Random;

public class Store {
    // make a hashmap and use syncronization and locks to make it like a concurrent hashmap
    // instead of object can also convert to json, string and same reverse logic
   ConcurrentHashMap<String, Object> storeHashMap;
    public Store() {
    this.storeHashMap = new ConcurrentHashMap<String, Object>();
    }

    void addKeyValuePair(String key, Object value) {
    storeHashMap.put(key, value);
    }

    Object getValue(String key) {
        return storeHashMap.get(key);
    }

    void printAllKeysAndValues() {
        for (String key: storeHashMap.keySet()){
            Object value = storeHashMap.get(key).toString();  
            System.out.println(key + " " + value);  
        } 
    }
}