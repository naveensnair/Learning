package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class CustomHashSet {
    HashSet<String> names = new HashSet<>();


    public void addNames() {
        names.add("Naveen");
        names.add("Charan");
        names.add("Kani");
        names.add("Naren");
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next() + " : ");
        }
    }

    public boolean isNameFound(String name) {
        if(!names.isEmpty()) {
            return names.contains(name);
        }
        return false;
    }
}
