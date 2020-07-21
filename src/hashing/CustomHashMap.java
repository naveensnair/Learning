package hashing;

import java.util.HashMap;
import java.util.Map;

public class CustomHashMap {
    HashMap<Integer, String> hashMap = new HashMap<>();

    public void addNames() {
        hashMap.put(1, "Naveen");
        hashMap.put(2, "Charan");
        hashMap.put(3, "Kani");
        hashMap.put(4, "Naren");
        for(Map.Entry<Integer, String> e : hashMap.entrySet()) {
            System.out.println(e.getValue());
        }
    }
}
