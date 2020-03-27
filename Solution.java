public class Solution {
    static ManagingStore keyValueManager;
    public Solution() {
     ManagingStore keyValueManager = new ManagingStore();
    }

    public static void main(String[] args) throws IOException {

   Write("nisha", "yadav");
   Write("Ether labs", 2020);

   Dump();

   System.out.println("Value of Ether labs" + Read("Ether labs"));

    int[] arrayData = {1, 2, 3, 4};
    Write("Dummy Array", arrayData);

   Dump();

    }

    public static void Write(String key, Object value) {
        keyValueManager.addKeyValue(key, value);
    }

    public static Object Read(String key) {
         return keyValueManager.getKeyValue(key);
    }

    public static void Dump() {
       keyValueManager.dumpAllKeysAndValues();
    }

}