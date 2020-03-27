
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Random;

public class ManagingStore {
    List<Store> listOfStores;

    public ManagingStore() {
         this.listOfStores = new ArrayList<Store>();
        // creates 10 stores and adds them to listOfStores
        int counter = 0;
        while(counter < 10) {
            listOfStores.add(new Store());
            counter++;
        }
        // DB.store(listOfStores);
    }

// For reliability, persistence in case of system failure
     public ManagingStore(List<Store> replicatedList) {
        this.listOfStores = new ArrayList<Store>();
       listOfStores = replicatedList;
        // DB.store(listOfStores);
    }

    // this can run every day or every few hours based on the traffic and storage capacity
    public void updateReplica() {
        // DB.store(listOfStores);
    }


    public int findStore(String key) {
        // can also use a hash function instead of this
        // basic idea being, same string should always redirect to same store number
        int storeNumber = (key.charAt(0) + 0) % 10;
        return storeNumber;
    }

// throw error in case of failure
    public void addKeyValue(String key, Object value) {
        int storeNumber = findStore(key);
        this.listOfStores.get(storeNumber).addKeyValuePair(key, value);
    }

    public Object getKeyValue(String key) {
        int storeNumber = findStore(key);
        return this.listOfStores.get(storeNumber).getValue(key);
    }

    public void dumpAllKeysAndValues() {
        int counter = 0;
        while(counter < 10) {
            System.out.println("Printing key value pairs of store " + (counter+1));
            listOfStores.get(counter).printAllKeysAndValues();
            counter++;
        }
    }

}